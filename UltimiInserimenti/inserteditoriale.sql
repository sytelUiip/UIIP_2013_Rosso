INSERT INTO gruppo VALUES ('amministratore');
INSERT INTO gruppo VALUES ('giornalista');

INSERT INTO funzionalita VALUES ('Crea account', 'cra');
INSERT INTO funzionalita VALUES ('Cancella account', 'cna');
INSERT INTO funzionalita VALUES ('Modifica account', 'mda');
INSERT INTO funzionalita VALUES ('Lista account', 'lia');
INSERT INTO funzionalita VALUES ('Creazione notizia', 'crn');
INSERT INTO funzionalita VALUES ('Modifica notizia', 'mdn');
INSERT INTO funzionalita VALUES ('Registra notizia', 'rgn');
INSERT INTO funzionalita VALUES ('Cancellazione notizia', 'cnn');
INSERT INTO funzionalita VALUES ('Trasmetti notizia', 'trn');
INSERT INTO funzionalita VALUES ('Visualizza notizia', 'vin');
INSERT INTO funzionalita VALUES ('Lista notizie', 'lin');
INSERT INTO funzionalita VALUES ('Annulla', 'ann');

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

INSERT INTO account VALUES ('Paolo', 'Rossi', 'admin@aa.a', '21232f297a57a5a743894a0e4a801fc3', 'R01', 'AD1', 'A');
INSERT INTO account VALUES ('Mario', 'Verdi', 'admin1@aa.a', '21232f297a57a5a743894a0e4a801fc3', 'R01', 'AD2', 'A');
INSERT INTO account VALUES ('Carlo', 'Bruni', 'admin2@aa.a', '21232f297a57a5a743894a0e4a801fc3', 'R01', 'AD3', 'A');

INSERT INTO gruppo_account VALUES ('amministratore','admin@aa.a');
INSERT INTO gruppo_account VALUES ('giornalista','admin@aa.a');
INSERT INTO gruppo_account VALUES ('amministratore','admin1@aa.a');
INSERT INTO gruppo_account VALUES ('amministratore','admin2@aa.a');

commit;
