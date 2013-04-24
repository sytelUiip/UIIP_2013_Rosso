CREATE TABLE gruppo (
	nome_gruppo varchar2(30),
	CONSTRAINT gruppo_pk PRIMARY KEY (nome_gruppo)
 );

CREATE TABLE account (
	nome varchar2(30) default '' NOT NULL,
	cognome varchar2(30) default '' NOT NULL,
	username varchar2(30) default '' NOT NULL,
	password varchar2(128) default '' NOT NULL,
	sigla_redazione varchar2(3) default '',
	sigla_giornalista varchar2(3) default '' NOT NULL,
	stato varchar2(1) default 'A' NOT NULL,
	CONSTRAINT account_pk PRIMARY KEY (username),
	CONSTRAINT account_uk UNIQUE (sigla_giornalista)
) ;

CREATE TABLE gruppo_account (
	nome_gruppo varchar2(30),
	username varchar2(30),
	CONSTRAINT gruppo_account_pk PRIMARY KEY (nome_gruppo,username),
	CONSTRAINT gruppo_account_fk1 FOREIGN KEY (nome_gruppo) REFERENCES gruppo(nome_gruppo) ON DELETE CASCADE,
	CONSTRAINT gruppo_account_fk2 FOREIGN KEY (username) REFERENCES account(username) ON DELETE CASCADE
) ;

CREATE TABLE funzionalita (
	nome_funzionalita varchar2(30),
	sigla_funzionalita varchar2(3),
	CONSTRAINT funzionalita_pk PRIMARY KEY (sigla_funzionalita)
) ;

CREATE TABLE funzionalita_gruppo (
	nome_gruppo varchar2(30),
	sigla_funzionalita varchar(3),
	CONSTRAINT funzionalita_gruppo_pk PRIMARY KEY (nome_gruppo, sigla_funzionalita),
	CONSTRAINT funzionalita_gruppo_fk1 FOREIGN KEY (nome_gruppo) REFERENCES gruppo(nome_gruppo) ON DELETE CASCADE,
	CONSTRAINT funzionalita_gruppo_fk2 FOREIGN KEY (sigla_funzionalita) REFERENCES funzionalita(sigla_funzionalita) ON DELETE CASCADE
) ;

CREATE TABLE notizia (
	id number(6),
	stato varchar2(1) default 'S' NOT NULL,
	lock_n varchar2(1) default 'N' NOT NULL,
	titolo varchar2(50),
	sottotitolo varchar2(100),
	autore varchar2(30),
	ultimo_digitatore varchar2(30) default NULL,
	ultimo_lock varchar2(30) default NULL,
	data_creazione date default CURRENT_TIMESTAMP NOT NULL,
	data_trasmissione date default NULL,
	testo CLOB,
	lunghezza_testo number(6),
	CONSTRAINT notizia_pk PRIMARY KEY (id),
	CONSTRAINT notizia_fk FOREIGN KEY (ultimo_digitatore) REFERENCES account(username),
	CONSTRAINT notizia_fk2 FOREIGN KEY (ultimo_lock) REFERENCES account(username)
) ;

create sequence seq_notizie INCREMENT BY 1 START WITH 1 NOCACHE NOCYCLE ;

CREATE or REPLACE 
TRIGGER trigger1
BEFORE INSERT ON notizia
FOR EACH ROW
BEGIN
	SELECT seq_notizie.nextval
	INTO :new.id FROM dual;
END trigger1;
/

CREATE or REPLACE
TRIGGER trigger2
AFTER UPDATE OF username ON account
FOR EACH ROW
BEGIN
	UPDATE notizia SET autore= :new.username WHERE autore= :old.username;
END;
/

CREATE or REPLACE
TRIGGER trigger3
AFTER UPDATE OF username ON account
FOR EACH ROW
BEGIN
	UPDATE notizia SET ultimo_digitatore= :new.username WHERE ultimo_digitatore= :old.username;
END;
/

CREATE or REPLACE
TRIGGER trigger4
AFTER UPDATE OF username ON account
FOR EACH ROW
BEGIN
	UPDATE gruppo_account SET username= :new.username WHERE username= :old.username;
END;
/

CREATE or REPLACE
TRIGGER trigger5
BEFORE INSERT ON notizia
FOR EACH ROW
DECLARE counter number;
BEGIN
	SELECT count(*) INTO counter from account where username = :new.autore;
	IF
		:new.autore != 'RCV' and counter = 0
	THEN
		raise_application_error(-20000, 'Autore non valido.');
	END IF;
END;
/

CREATE or REPLACE
TRIGGER trigger6
AFTER UPDATE OF username ON account
FOR EACH ROW
BEGIN
	UPDATE notizia SET ultimo_lock= :new.username WHERE ultimo_lock= :old.username;
END;
/
