CREATE DATABASE POOAV2;
USE POOAV2;

DROP TABLE IF EXISTS `atendente`;
DROP TABLE IF EXISTS `cliente`;

CREATE TABLE atendente (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    data_nascimento VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    cod VARCHAR(5) NOT NULL
);
CREATE TABLE cliente (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    data_nascimento VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    cod VARCHAR(5) NOT NULL
);
INSERT INTO cliente VALUES ('001', 'cliente', 'cliente@gmail.com', '01/01/2000', 'cliente', '0');
INSERT INTO atendente VALUES ('001', 'atendente', 'atendente@gmail.com', '01/01/2000', 'atendente', '1');