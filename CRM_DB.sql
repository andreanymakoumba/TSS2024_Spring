use crm;
create table cliente(
id_cliente int primary key,
nome_azienda varchar(100),
categoria_merceologica varchar(100),
tipologia_cliente varchar(50),
utente_associato int,
foreign key (utente_associato) references utente(id_utente)
);

create table servizi_consulenza(
id_servizio int primary key,
nome_servizio varchar(100),
descrizione text,
prezzo decimal(10, 2)
);

CREATE TABLE Note_Cliente (
 ID_Nota INT PRIMARY KEY,
 ID_Cliente INT,
 Testo_Nota TEXT,
 Data_Registrazione DATE,
 Utente_Registrante INT,
 FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente),
 FOREIGN KEY (Utente_Registrante) REFERENCES Utente(ID_Utente)
 );
 
 CREATE TABLE Opportunità (
 ID_Opportunità INT PRIMARY KEY,
 ID_Cliente INT,
 Descrizione_Opportunità TEXT,
 Data_Inserimento DATE,
 Stato VARCHAR(50),
 FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente)
);
ALTER TABLE opportunità RENAME opportunita;
ALTER TABLE opportunita rename COLUMN Descrizione_Opportunità TO Descrizione_Opportunita;
ALTER TABLE opportunita rename COLUMN ID_Opportunità TO ID_Opportunita;


CREATE TABLE Appuntamenti (
 ID_Appuntamento INT PRIMARY KEY,
 ID_Cliente INT,
 Data_Appuntamento DATE,
 Descrizione TEXT,
 Utente_Associato INT,
 FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente),
 FOREIGN KEY (Utente_Associato) REFERENCES Utente(ID_Utente)
);

CREATE TABLE Tag_Cliente (
 ID_Tag INT PRIMARY KEY,
 Nome_Tag VARCHAR(50)
);
select* from utente;

CREATE TABLE Cliente_Tag (
 ID_Cliente_Tag INT PRIMARY KEY,
 ID_Cliente INT,
 ID_Tag INT,
 FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente),
 FOREIGN KEY (ID_Tag) REFERENCES Tag_Cliente(ID_Tag)
);

CREATE TABLE Utente (
 ID_Utente INT PRIMARY KEY,
 Nome_Utente VARCHAR(50),
 Ruolo VARCHAR(50),
 Email VARCHAR(100),
 Password VARCHAR(100),
 Data_Registrazione DATE
);

INSERT INTO Cliente (ID_Cliente, Nome_Azienda, Categoria_Merceologica, Tipologia_Cliente, Utente_Associato)
VALUES (1, 'ABC SRL', 'IT', 'Cliente Fidelizzato', 1),
 (2, 'DEF SPA', 'Logistica', 'Nuovo Cliente', 2),
 (3, 'GHI SNC', 'Alimentare', 'Prospect', 3);
 
INSERT INTO Servizi_Consulenza (ID_Servizio, Nome_Servizio, Descrizione, Prezzo)
VALUES
 (1, 'Consulenza IT', 'Assistenza e supporto tecnico IT', 100.00),
 (2, 'Consulenza Logistica', 'Ottimizzazione dei processi logistici', 150.00),
 (3, 'Consulenza Alimentare', 'Analisi di mercato nel settore alimentare', 120.00);
 
 INSERT INTO Note_Cliente (ID_Nota, ID_Cliente, Testo_Nota, Data_Registrazione, Utente_Registrante)
 VALUES
 (1, 1, 'Cliente interessato a espandere i servizi IT', '2024-04-10', 1),
 (2, 2, 'Proposta commerciale inviata via email', '2024-04-11', 2),
 (3, 3, 'Richiesta di preventivo per servizi logistici', '2024-04-12', 3);

INSERT INTO Opportunità (ID_Opportunità, ID_Cliente, Descrizione_Opportunità,
Data_Inserimento, Stato)
VALUES
 (1, 1, 'Proposta per implementare nuovi servizi IT', '2024-04-10', 'In attesa'),
 (2, 2, 'Offerta per consulenza logistica', '2024-04-11', 'In trattativa'),
 (3, 3, 'Discussione preliminare sui servizi alimentari', '2024-04-12', 'In corso');
 
INSERT INTO Appuntamenti (ID_Appuntamento, ID_Cliente, Data_Appuntamento, Descrizione,
Utente_Associato)
VALUES
 (1, 1, '2024-04-15', 'Riunione in sede per discutere le opportunità', 1),
 (2, 2, '2024-04-16', 'Chiamata telefonica per seguire up sulla proposta', 2),
 (3, 3, '2024-04-17', 'Incontro presso il cliente per analisi dei requisiti', 3);
 
INSERT INTO Tag_Cliente (ID_Tag, Nome_Tag)
VALUES
 (1, 'Premium'),
 (2, 'Potenziale'),
 (3, 'Nuovo Cliente');
 
INSERT INTO Cliente_Tag (ID_Cliente_Tag, ID_Cliente, ID_Tag)
VALUES
 (1, 1, 1),
 (2, 2, 2),
 (3, 3, 3);
 
INSERT INTO Utente (ID_Utente, Nome_Utente, Ruolo, Email, Password, Data_Registrazione)
VALUES
 (1, 'admin', 'Amministratore', 'admin@example.com', 'password', '2024-04-01'),
 (2, 'user1', 'Registrato', 'user1@example.com', 'password', '2024-04-02'),
 (3, 'user2', 'Registrato', 'user2@example.com', 'password', '2024-04-03');



