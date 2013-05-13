package com.reply.editoriale.receiver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;


import org.apache.axis2.AxisFault;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.reply.editoriale.entity.Notizia;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;



public class Receiver {
	
	public void validateReadXml() throws AxisFault, Exception{
		
		Notizia notiziaReceiver=null;
		Document doc = null;
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		ErrorHandler errorH = new SimpleErrorHandler();
		DocumentBuilder documentBuilder;
		Properties prop = new Properties();
		
		File config = new File("C:\\apache-tomcat-6.0.36\\conf","config_batch.properties");
//		File config = new File("C:\\eclipseJunoRS2\\LibreriaServer\\apache-tomcat-6.0.36\\conf","config_batch.properties");
		if (!config.exists()){
			new File(prop.getProperty("path_receiver")).mkdirs();
			config.createNewFile();
		}
		prop.load(new FileInputStream(config));
		File fileRec = new File(prop.getProperty("path_receiver"));
		File[] listaFile;
		if (fileRec.isDirectory()) {
			listaFile = fileRec.listFiles();
			System.out.println("+++++++++++++++++++++++++++"+listaFile.length);
			for (int i = 0; i < listaFile.length; i++) {
				File fileLettura = listaFile[i];
				try {
					documentBuilder=documentFactory.newDocumentBuilder();
					documentBuilder.setErrorHandler(errorH);
					doc= documentBuilder.parse(fileLettura.getPath());
					doc.getDocumentElement().normalize();
					
					if(validateDocXml(doc)){
						notiziaReceiver = new Notizia();
						Node notiziaNodo = doc.getElementsByTagName("Notizia").item(0);
						
						if(notiziaNodo.getNodeType() == Node.ELEMENT_NODE){
							Element notiziaElement = (Element) notiziaNodo;
							
							Element anagraficaElement = (Element) notiziaElement.getElementsByTagName("Anagrafica").item(0);
							String sottotitolo = anagraficaElement.getAttribute("Sottotitolo");
							System.out.println("Sottotitolo: " + sottotitolo);
							String dataCreazione = anagraficaElement.getAttributeNode("DataCreazione").getValue();
							System.out.println("DataCreazione " + dataCreazione);
							String titolo = anagraficaElement.getAttributeNode("Titolo").getValue();
							System.out.println("Titolo: " +titolo);
							
							//Element testoElement = (Element) notiziaElement.getElementsByTagName("Testo").item(0);
							
							NodeList nodes = notiziaElement.getElementsByTagName("Testo").item(0).getChildNodes();
							Node nodoSingle = nodes.item(0);
							String testo = nodoSingle.getNodeValue();
							System.out.println("Testo " +testo);
							
							notiziaReceiver.setAutore("RCV");
							notiziaReceiver.setDataCreazione(dataCreazione);
							notiziaReceiver.setSottoTitolo(sottotitolo);
							notiziaReceiver.setTitolo(titolo);
							notiziaReceiver.setTesto(testo);
							insertDao(notiziaReceiver);
							
						}
						fileLettura.delete();
					}
					else{
						System.out.println("ENTRA NELL' ELSE!!!");
						rename(fileLettura);
					}
					
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void rename(File fileInvalido) throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		File config = new File("C:\\apache-tomcat-6.0.36\\conf","config_batch.properties");
//		File config = new File("C:\\eclipseJunoRS2\\LibreriaServer\\apache-tomcat-6.0.36\\conf","config_batch.properties");
		
		if (!config.exists()){
			new File(prop.getProperty("path_invalidate")).mkdirs();
			config.createNewFile();
		}
		prop.load(new FileInputStream(config));
		File fileDest = new File(prop.getProperty("path_invalidate")+"\\fileInvalido-" + fileInvalido.getName());
		fileInvalido.renameTo(fileDest);
	}
	
	public static boolean validateDocXml(Document doc) throws FileNotFoundException, IOException{
		
		boolean esito = false;
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		Properties prop = new Properties();
		File config = new File("C:\\apache-tomcat-6.0.36\\conf","config_batch.properties");
//		File config = new File("C:\\eclipseJunoRS2\\LibreriaServer\\apache-tomcat-6.0.36\\conf","config_batch.properties");
		prop.load(new FileInputStream(config));
		File schemaLocation = new File(prop.getProperty("path_xsd"));
		
		try {
			Schema schema = schemaFactory.newSchema(schemaLocation);
			Validator validator = schema.newValidator();
			DOMSource source = new DOMSource(doc);
			validator.validate(source);
			esito=true;
			
			
		} catch (SAXException e) {
			esito=false;
			System.out.println("File non ben formato!!!");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return esito;
	}
	
	public void insertDao(Notizia news) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		
		try {
			dao.inserisciNotiziaEsterna(news);	
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
	
	
}
