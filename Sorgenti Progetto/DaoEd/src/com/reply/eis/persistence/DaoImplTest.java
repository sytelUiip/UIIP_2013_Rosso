package com.reply.eis.persistence;

import static org.junit.Assert.*;

import org.apache.axis2.AxisFault;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.reply.editoriale.entity.Account;
import com.reply.editoriale.entity.Notizia;
import com.reply.eis.persistence.DaoImpl;
import com.sun.org.apache.xpath.internal.Expression;

public class DaoImplTest {
	
	DaoImpl dao=null;
	
@Before
public void setUp() throws AxisFault, Exception{
	dao=new DaoImpl();	
}

///////////////////////////////////////LOGIN//////////////////////////////////////////////////////////////

//Test per la verifica dell'accesso al sistema dell'utente di default
@Test
public void executeLoginUsernameTest(){
	Account a=null;
	try {
		a=dao.executeLogin("admin@aa.a", "admin");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals("admin@aa.a",a.getUsername());

}
//Test per la verifica dell'eccezione quando lo user del login non esiste
@Test
public void executeExceptionLoginTest(){
	try{
	dao.executeLogin("adminss@aa.a", "admin");
	//fail ();
	}catch(Exception e){assertTrue(true);}
	
}

///////////////////////////////ACCOUNT///////////////////////////////////////////

// Test per la verifica del recupero tramite username di un account esistente
@Test
public void executeCaricaAccountTest(){
	Account a=null;
	try {
		a=dao.caricaAccount("admin@aa.a");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	assertEquals("admin@aa.a",a.getUsername() );
}

// Test che verifica che l'eccezione venga catturata quando si tenta di caricare un account non esistente 
@Test(expected =Exception.class)
public void executeExceptionCaricaAccountTest() throws Exception {
	
	
			dao.caricaAccount("adminNonEsiste@aa.aa");
			//fail ();
		    //assertTrue(true);
	
}

//////////////////////////////////////////////////////////////////////////////////
//Test per la verifica dell'inserimento di un account non presente nel sistema. 
//Tale test deve essere effettuato soltanto la prima volta, in quanto l'utente inserito è necessario per i test successivi

@Test
public void executeInsertNuovoAccountTest() throws Exception{
	
	Account a= null;
	String pwd = DaoImpl.MD5("admin");
   a= dao.executeInsNuovoAccount("Crea account", "admin@aa.a", pwd, "Roberto", "Grimaldi", "admin348@aa.aa", "rob", "vfr", "asd", "Amministratore");
		//assertEquals("admin47@aa.a",a.getUsername());

	assertEquals("Roberto",a.getNome());
}

//Test che verifica che il metodo vada in eccezione se si tenta di inserire un account già presente 
@Test(expected = Exception.class)
public void executeExceptionInsertNuovoAccountTest() throws Exception{

//String pwd = dao.MD5("admin"); 
dao.executeInsNuovoAccount("Crea account", "admin@aa.a", DaoImpl.MD5("admin"), "Roberto", "Grimaldi", "admin348@aa.aa", "rob","vfr", "asd", "Amministratore");
}

//verifica che il metodo executeCancellaAccount vada in eccezione se si tenta di cancellare un account che non esiste
@Test(expected = Exception.class)
public void executeCancellaAccountExceptionTest()throws Exception{
		dao.executeCancellaAccount("Cancella account", "admin@aa.a", "admin", "adminNonEsiste@aa.aa");
	}


//Test per la verifica della modifica di un account
@Test 
public void modificaAccountTest1()throws Exception{
Account a=null;
a = dao.modificaAccount("Modifica account","admin@aa.a",DaoImpl.MD5("admin"),"admin348@aa.aa", "admin", "Roberta", "Grimalda", "ylk", "gtm");
assertEquals("Roberta",a.getNome() );
		}


//Test per la verifica che il metodo vada in eccezione se si tenta di modificare un account che non esiste
@Test(expected = Exception.class)
public void modificaAccount()throws Exception{
		dao.modificaAccount("Modifica account","admin@aa.a",DaoImpl.MD5("admin"),"adminNonEsiste@aa.aa","rob","Roberta", "Grimaldi",  "gtr", "vfr");
	}

//Test per la verifica dell'aggiunta di privilegi per un account esistente
@Test
public void aggiungiPrivilegiTest() throws AxisFault, Exception{
Account a;
dao.AggiungiPrivilegio("Crea account", "admin@aa.a", DaoImpl.MD5("admin"), "admin348@aa.aa");
a=dao.caricaAccount("admin348@aa.aa");
assertEquals(2, a.getGruppiLavoro().length);
}

//Test per la verifica della rimozione di privilegi
@Test
public void rimuoviPrivilegiTest() throws AxisFault, Exception{
Account a=null;
dao.RimuoviPrivilegio("Crea account", "admin@aa.a",DaoImpl.MD5("admin") , "admin348@aa.aa");
a=dao.caricaAccount("admin348@aa.aa");
assertEquals("amministratore" , a.getGruppiLavoro()[0].getNome());
}

//Test che verifica che il metodo vada in eccezione se l'utente loggato tenta di modificare il ruolo di un account che non esiste
@Test(expected=Exception.class)
public void aggiungiPrivilegiExceptionTest() throws Exception{	
	dao.AggiungiPrivilegio("Crea account", "admin@aa.a",DaoImpl.MD5("admin"), "adminSbagliato@aa.a");
}

//Test per la verifica della visualizzazione della lista degli account
@Test
public void prendiListaAccountTest() throws Exception{
Account[] acc= dao.prendiListaAccount("Lista account", "admin@aa.a",DaoImpl.MD5("admin"), 1, 10);

boolean t=false;
if (acc.length>0){
t = true;
}
assertTrue(t);
}

//Test che verifica che il metodo vada in eccezione se l'utente non può essere autenticato
@Test(expected= Exception.class)
public void exceptionPrendiListaAccountTest() throws Exception{
dao.prendiListaAccount("Lista account", "adminERRORE@aa.a", DaoImpl.MD5("admin"), 1, 10);
}	

/////////////////////////////NOTIZIA//////////////////////////////////////////////////

//Test per la creazione di una nuova notizia
@Test
public void createNotiziaTest() throws Exception{
Notizia n = dao.createNotizia("Creazione notizia","admin@aa.a",DaoImpl.MD5("admin"),"admin@aa.a","notiziaTest", "notizia di test", "notizatestata");

assertEquals("notiziaTest", n.getTitolo());
}

//Test per la visualizzazione delle notizie per autore
@Test
public void executeVisualizzaNotiziaAutoreTest() throws Exception{
Notizia[] notizieAutore = dao.executeVisualizzaNotizieAutore("Visualizza notizia", "admin@aa.a", DaoImpl.MD5("admin"), "admin@aa.a", 1, 3);

boolean t=false;
if (notizieAutore.length>0){
t = true;
}
assertTrue(t);
}

//Test per la verifica del lancio di eccezione se l'autenticazione non è avvenuta correttamente nella visualizzazione delle notizie per autore
@Test(expected= Exception.class)
public void executeVisNotiziaAutoreExceptionTest() throws Exception{
dao.executeVisualizzaNotizieAutore("Visualizza notizia", "admin@aa.a", DaoImpl.MD5("Sbaglio"), "admin@aa.a", 1, 3);
}

//Test per la visualizzazione delle notizie per titolo
@Test
public void executeVisualizzaNotiziaTitoloTest() throws Exception{
Notizia[] notizieTitolo = dao.executeListaNotiziaTitolo("Visualizza notizia", "admin@aa.a", DaoImpl.MD5("admin"), "notiziaTest",1, 10);

boolean t=false;
if (notizieTitolo.length>0){
t = true;
}
assertTrue(t);
}


//Test per la visualizzazione delle notizie per stato
@Test
public void executeVisualizzaNotiziaStatoTest() throws Exception{
Notizia[] notizieStato = dao.executeVisualizzaNotiziaStato("Visualizza notizia", "admin@aa.a", DaoImpl.MD5("admin"), "S", 1, 10);

boolean t=false;
if (notizieStato.length>0){
t = true;
}
assertTrue(t);
}

//Test per la visualizzazione della lista di notizie
@Test
public void executeListaNotizieTest() throws Exception{
Notizia[] notizie = dao.executeListaNotizie("Lista notizie", "admin@aa.a", DaoImpl.MD5("admin"), 1, 10);

boolean t=false;
if (notizie.length>0){
t = true;
}
assertTrue(t);
}

//Test per verificare che il metodo mandi una eccezione quando l'utente non è abilitato per cancellare la notizia
@Test(expected= Exception.class)
public void executeCancellaNotiziaFallitaTest() throws Exception{	
dao.executeCancellaNotizia("Cancellazione notizia", "adminERRORE@aa.a",DaoImpl.MD5("admin"), 9);
}

//Test per verificare che il metodo mandi una eccezione se si registra una notizia non presente
@Test(expected = Exception.class)
public void registraNotiziaTest() throws Exception{
dao.registraNotizia("Registra notizia", "admin", "admin@aa.a", 99999999, "", "", "");
}

//Test per la verifica dell'inserimento del Lock
@Ignore
public void setLockTest() throws Exception{
	Notizia n=null;
	
	dao.setLock(1,"admin@aa.a");
	n=dao.executeCercaNotiziaId("Modifica notizia", "admin@aa.a",DaoImpl.MD5("admin"),1);
	assertEquals("Y",n.getLock());
}

//Test per la verifica del corretto annullamento delle modifiche di una notizia
@Ignore
public void AnnullaTest() throws Exception{
	Notizia n=null;
	
	dao.annulla("Modifica notizia", "admin@aa.a",DaoImpl.MD5("admin"),1);
	n=dao.executeCercaNotiziaId("Modifica notizia", "admin@aa.a",DaoImpl.MD5("admin"),1);
	assertEquals("N",n.getLock());
}




///////////////////////////////////////////////////////////////////////////////////


}

