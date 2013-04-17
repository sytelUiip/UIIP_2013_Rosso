
  CREATE OR REPLACE PROCEDURE "EDITORIALE"."ANNULLA" 
(
  P_ID IN NUMBER  
) AS 
BEGIN
  UPDATE NOTIZIA SET stato='S', lock_n='N' WHERE id=P_ID;
END ANNULLA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CANCELLA_ACCOUNT" 
(
  P_USERNAME IN VARCHAR2
) AS
BEGIN
  UPDATE ACCOUNT SET stato='C' WHERE username=P_USERNAME;
  DELETE FROM gruppo_account WHERE username=P_USERNAME;
  COMMIT;
END CANCELLA_ACCOUNT;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CANCELLAZIONE_NOTIZIA" 
(
  P_ID IN NUMBER  
) AS 
BEGIN
  UPDATE NOTIZIA SET stato='C' WHERE id=P_ID;
  COMMIT;
END CANCELLAZIONE_NOTIZIA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CERCA_ACCOUNT_USERNAME" 
(
  P_USERNAME IN VARCHAR2
, P_CURSOR OUT SYS_REFCURSOR
) AS 
BEGIN
  OPEN P_CURSOR FOR 
        SELECT * FROM account WHERE username=P_USERNAME;
END CERCA_ACCOUNT_USERNAME;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CERCA_NOTIZIA_AUTORE" (P_AUTORE IN VARCHAR2, P_CURSOR OUT SYS_REFCURSOR )
AS
BEGIN
    OPEN P_CURSOR FOR 
        SELECT * FROM notizia WHERE autore=P_AUTORE;
END CERCA_NOTIZIA_AUTORE;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CERCA_NOTIZIA_STATO" (P_STATO IN VARCHAR2, P_CURSOR OUT SYS_REFCURSOR )
AS
BEGIN
    OPEN P_CURSOR FOR 
        SELECT * FROM notizia WHERE stato=P_STATO;
END CERCA_NOTIZIA_STATO;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CERCA_NOTIZIA_TITOLO" (P_TITOLO IN VARCHAR2, P_CURSOR OUT SYS_REFCURSOR )
AS
BEGIN
    OPEN P_CURSOR FOR 
        SELECT * FROM notizia WHERE titolo=P_TITOLO;
END CERCA_NOTIZIA_TITOLO;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CREA_ACCOUNT" 
(
  P_NOME IN VARCHAR2
, P_COGNOME IN VARCHAR2
, P_USERNAME IN VARCHAR2
, P_PASSWORD IN VARCHAR2
, P_SIGLA_REDAZIONE IN VARCHAR2
, P_SIGLA_GIORNALISTA IN VARCHAR2
) AS
BEGIN
  INSERT INTO ACCOUNT (nome, cognome, username, password, sigla_redazione, sigla_giornalista) VALUES (P_NOME, P_COGNOME, P_USERNAME, P_PASSWORD, P_SIGLA_REDAZIONE, P_SIGLA_GIORNALISTA);
  INSERT INTO GRUPPO_ACCOUNT VALUES ('giornalista', P_USERNAME);
  COMMIT;
END CREA_ACCOUNT;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CREAZIONE_NOTIZIA" 
(
  P_TITOLO IN VARCHAR2
, P_SOTTOTITOLO IN VARCHAR2
, P_AUTORE IN VARCHAR2
, P_ULTIMO_DIGITATORE IN VARCHAR2
, P_LUNGHEZZA_TESTO IN NUMBER
, P_TESTO IN NOTIZIA.testo%TYPE
) AS
BEGIN
  INSERT INTO NOTIZIA (titolo, sottotitolo, autore, ultimo_digitatore, lunghezza_testo, testo)
  VALUES
  (P_TITOLO, P_SOTTOTITOLO, P_AUTORE, P_ULTIMO_DIGITATORE, P_LUNGHEZZA_TESTO, P_TESTO);
END CREAZIONE_NOTIZIA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."LISTA_ACCOUNT" 
(
  P_CURSOR OUT SYS_REFCURSOR
)
AS
BEGIN
    OPEN P_CURSOR FOR 
        SELECT * FROM account a, gruppo_account g WHERE a.username=g.username;
END LISTA_ACCOUNT;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."LISTA_NOTIZIA" (P_CURSOR OUT SYS_REFCURSOR )
AS
BEGIN
    OPEN P_CURSOR FOR 
        SELECT * FROM notizia;
END LISTA_NOTIZIA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."LOGIN" 
(
  P_USERNAME IN VARCHAR2  
, P_PASSWORD IN VARCHAR2  
, P_CURSOR OUT SYS_REFCURSOR
) AS 
BEGIN
 OPEN P_CURSOR FOR
  SELECT * FROM account a, gruppo_account g WHERE a.username=P_USERNAME and a.password=P_PASSWORD and a.username=g.username;
END LOGIN;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."MODIFICA_ACCOUNT" 
(
  P_USERNAME_OLD IN VARCHAR2
, P_USERNAME_NEW IN VARCHAR2
, P_PASSWORD IN VARCHAR2
, P_SIGLA_REDAZIONE IN VARCHAR2
, P_SIGLA_GIORNALISTA IN VARCHAR2
, P_RUOLO IN VARCHAR2
) AS
BEGIN
  UPDATE ACCOUNT
  SET
  username=P_USERNAME_NEW, password=P_PASSWORD, sigla_redazione=P_SIGLA_REDAZIONE, sigla_giornalista=P_SIGLA_GIORNALISTA
  WHERE username=P_USERNAME_OLD;
  COMMIT;
  UPDATE GRUPPO_ACCOUNT
  SET
  nome_gruppo = P_RUOLO
  WHERE username=P_USERNAME_NEW;
  COMMIT;
END MODIFICA_ACCOUNT;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."MODIFICA_NOTIZIA" 
(
P_ULTIMO_DIGITATORE IN VARCHAR2
, P_ID IN NUMBER
) AS 
BEGIN
  UPDATE NOTIZIA SET lock_n='Y', ultimo_digitatore=P_ULTIMO_DIGITATORE
  WHERE id=P_ID;
  commit;
END MODIFICA_NOTIZIA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."REGISTRA_NOTIZIA" 
(
  P_ID IN NUMBER
, P_TITOLO IN VARCHAR2  
, P_SOTTOTITOLO IN VARCHAR2  
, P_LUNGHEZZA_TESTO IN VARCHAR2  
, P_TESTO IN CLOB  
) AS 
BEGIN
  UPDATE NOTIZIA SET titolo=P_TITOLO, sottotitolo=P_SOTTOTITOLO, lunghezza_testo=P_LUNGHEZZA_TESTO, testo=P_TESTO, lock_n='N' WHERE id=P_ID;
  COMMIT;
END REGISTRA_NOTIZIA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."REGISTRA_NOTIZIE" 
(
  P_ID IN NUMBER
, P_TITOLO IN VARCHAR2  
, P_SOTTOTITOLO IN VARCHAR2  
, P_LUNGHEZZA_TESTO IN VARCHAR2  
, P_TESTO IN CLOB  
) AS 
BEGIN
  UPDATE NOTIZIA SET titolo=P_TITOLO, sottotitolo=P_SOTTOTITOLO, lunghezza_testo=P_LUNGHEZZA_TESTO, testo=P_TESTO, lock_n='N' WHERE id=P_ID;
  COMMIT;
END REGISTRA_NOTIZIE;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."TRASMETTI_NOTIZIA" 
(
  P_ID IN NUMBER  
) AS 
BEGIN
  UPDATE NOTIZIA SET stato='Q', data_trasmissione=CURRENT_TIMESTAMP WHERE id=P_ID;
  COMMIT;
END TRASMETTI_NOTIZIA;
/
 

  CREATE OR REPLACE PROCEDURE "EDITORIALE"."CARICA_FUNZIONALITA" 
(
  P_NOME_GRUPPO IN VARCHAR2
, P_CURSOR OUT SYS_REFCURSOR  
) AS 
BEGIN
  OPEN P_CURSOR FOR 
        SELECT * FROM funzionalita f, funzionalita_gruppo g WHERE f.sigla_funzionalita=g.sigla_funzionalita and g.nome_gruppo=P_NOME_GRUPPO;
END CARICA_FUNZIONALITA;
/