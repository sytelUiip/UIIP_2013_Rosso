package com.reply.editoriale.Transmitter;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jdom2.Attribute;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

import com.reply.editoriale.entity.Notizia;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;




public class XmlTrasmitter {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(XmlTrasmitter.class);

	private Document doc;

	public Document getDoc() {
		return doc;
	}
	
	public Element createNotizia(String titolo, String sottotitolo, String autore, String ultimoDigitatore, String dataCreazione, String testoDb){
		
		Element notizia = doc.createElement("Notizia");
		doc.appendChild(notizia);
		
		Element anagrafica = doc.createElement("Anagrafica");
		
		anagrafica.setAttribute("Titolo", titolo);
		anagrafica.setAttribute("Sottotitolo", sottotitolo);
		anagrafica.setAttribute("Autore", autore);
		anagrafica.setAttribute("UltimoDigitatore", ultimoDigitatore);
		anagrafica.setAttribute("DataCreazione", dataCreazione);
		
		Element testo = doc.createElement("Testo");
		testo.setTextContent(testoDb);
		
		notizia.appendChild(anagrafica);
		notizia.appendChild(testo);
		
		return notizia;
		
	}
	
	public Document createFile(String titolo, String sottotitolo, String autore, String ultimoDigitatore, String dataCreazione, String testoDb)
	{
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		documentFactory.setValidating(true);

		DocumentBuilder documentBuilder;

		try{
			documentBuilder = documentFactory.newDocumentBuilder();
			doc = documentBuilder.newDocument();
		}catch(ParserConfigurationException pce){}

		createNotizia(titolo, sottotitolo, autore, ultimoDigitatore, dataCreazione, testoDb);
		return doc;
	}
	
	public void printFile(Document doc) throws TransformerException, IOException
	{
		//set up a transformer
        TransformerFactory transfac = TransformerFactory.newInstance();
        Transformer trans = transfac.newTransformer();
        trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        trans.setOutputProperty(OutputKeys.INDENT, "yes");

		//create string from xml tree
        StringWriter sw = new StringWriter();
        StreamResult result = new StreamResult(sw);
        DOMSource source = new DOMSource(doc);
        trans.transform(source, result);
        String xmlString = sw.toString();

      //print xml
        System.out.println("Here's the xml:\n\n" + xmlString);

	}

	public void saveDOM(Document doc, Writer w) throws IOException {

		DOMImplementationLS ls = (DOMImplementationLS) doc.getImplementation();
		LSOutput o = ls.createLSOutput();
		LSSerializer s = ls.createLSSerializer();

		try {
			o.setCharacterStream (w);
			s.write (doc,o); }
		catch (LSException lse) {

			System.err.println(lse.getMessage());
		}
	}

	public void printDOM(Document doc) {

		//saveDOM(doc,new PrintWriter(new File("elenco_notizie.xml")));
		System.out.println("Scrittura file");
	}
	
	public void transmitterNews() throws FileNotFoundException, IOException{
		DaoInterface dao = new DaoImpl();
		System.out.println("Entra !!");
		Notizia [] notizie = null;
		try {
			notizie = dao.executePrendiNotiziaTrasmitter();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<notizie.length; i++){
			System.out.println("Notizia di " + notizie[i].getAutore());
			XmlTrasmitter conversione = new XmlTrasmitter();
			int id = notizie[i].getId();
			String titolo = notizie[i].getTitolo();
			String autore = notizie[i].getAutore();
			String testo = notizie[i].getTesto();
			String sottotitolo = notizie[i].getSottoTitolo();
			String ultimoDigitatore = notizie[i].getUltimoDigitatore();
			String dataCreazione = notizie[i].getDataCreazione();
//			String dataTrasmissione = notizie[i].getDataTrasmissione();
			GregorianCalendar gc1 = new GregorianCalendar();
			SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
			String data = f.format(gc1.getTime());
			
//			String dataTrasmissioneAttuale = data;
//			SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
//			notizie[i].setDataTrasmissione(f1.format(gc1));
			Document doc = conversione.createFile(titolo, sottotitolo, autore, ultimoDigitatore, dataCreazione, testo);
			
			try {
				try {
					conversione.printFile(doc);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			GregorianCalendar gc = new GregorianCalendar();
			SimpleDateFormat f2 = new SimpleDateFormat("yyyyMMddHHmmssSS");
			String data2 = f2.format(gc.getTime());
			Properties prop = new Properties();
		File config = new File("C:\\apache-tomcat-6.0.36\\conf","config_batch.properties");
//			File config = new File("C:\\eclipseJunoRS2\\LibreriaServer\\apache-tomcat-6.0.36\\conf","config_batch.properties");
			if (!config.exists()){
				System.out.println("Il file non esiste");
				new File(prop.getProperty("path_trasmitter")).mkdirs();
				config.createNewFile();
			}
			System.out.println("Il file esiste.");
			prop.load(new FileInputStream(config));
			try {
				conversione.saveDOM(doc, new PrintWriter(new File(prop.getProperty("path_trasmitter"),dataCreazione+"-"+id+"-"+data2+".xml")));
				dao.setNotiziaTrasmessa(id);

				if (logger.isInfoEnabled()) {
					logger.info("transmitterNews() - Una nuova notizia è stata trasmessa.");
				}

				System.out.println(prop.getProperty("path_trasmitter"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conversione.printDOM(doc);

		}
	
	}
}
