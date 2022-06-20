CREATE SCHEMA users.user;

CREATE TABLE users.user (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    endereco VARCHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(12) NOT NULL,
    data_cadastro TIMESTAMP NOT NULL
);