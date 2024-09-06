CREATE TABLE professores (
     id SERIAL PRIMARY KEY,
     nome VARCHAR(255) NOT NULL,
     idade INT,
     materia VARCHAR(255),
     observacao TEXT
);
