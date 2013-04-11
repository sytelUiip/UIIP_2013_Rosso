INSERT INTO gruppo VALUES ('amministratore');
INSERT INTO gruppo VALUES ('giornalista');

INSERT INTO funzionalita VALUES ('crea account', 'cra');
INSERT INTO funzionalita VALUES ('cancella account', 'cna');
INSERT INTO funzionalita VALUES ('modifica account', 'mda');
INSERT INTO funzionalita VALUES ('lista account', 'lia');
INSERT INTO funzionalita VALUES ('creazione notizia', 'crn');
INSERT INTO funzionalita VALUES ('modifica notizia', 'mdn');
INSERT INTO funzionalita VALUES ('registra notizia', 'rgn');
INSERT INTO funzionalita VALUES ('cancellazione notizia', 'cnn');
INSERT INTO funzionalita VALUES ('trasmetti notizia', 'trn');
INSERT INTO funzionalita VALUES ('visualizza notizia', 'vin');
INSERT INTO funzionalita VALUES ('lista notizie', 'lin');
INSERT INTO funzionalita VALUES ('annulla', 'ann');

INSERT INTO funzionalita_gruppo VALUES ('amministratore', 'cra');
INSERT INTO funzionalita_gruppo VALUES ('amministratore', 'cna');
INSERT INTO funzionalita_gruppo VALUES ('amministratore', 'mda');
INSERT INTO funzionalita_gruppo VALUES ('amministratore', 'lia');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'crn');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'mdn');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'rgn');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'cnn');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'trn');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'vin');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'lin');
INSERT INTO funzionalita_gruppo VALUES ('giornalista', 'ann');

INSERT INTO account VALUES ('admin', 'admin', 'admin@aa.a', 'admin', 'aaa', 'ad1', 'A');
INSERT INTO account VALUES ('admin1', 'admin1', 'admin1@aa.a', 'admin', 'aaa', 'ad2', 'A');
INSERT INTO account VALUES ('admin2', 'admin2', 'admin2@aa.a', 'admin', 'aaa', 'ad3', 'A');

INSERT INTO gruppo_account VALUES ('amministratore','admin@aa.a');
INSERT INTO gruppo_account VALUES ('giornalista','admin@aa.a');
INSERT INTO gruppo_account VALUES ('amministratore','admin1@aa.a');
INSERT INTO gruppo_account VALUES ('amministratore','admin2@aa.a');

commit;
