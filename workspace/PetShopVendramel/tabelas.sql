CREATE TABLE cliente (
id INT NOT NULL,
nome VARCHAR (150) NOT NULL,
cpf VARCHAR(20) NOT NULL,
endereco VARCHAR(MAX) NOT NULL,
telefone VARCHAR(15) NOT NULL,
PRIMARY KEY (id)
)

CREATE TABLE animal (
id INT NOT NULL,
nome VARCHAR (50) NOT NULL,
rga INT NULL,
marcacaoIndividual INT NULL,
numeroIbama INT NULL,
especie VARCHAR(100) NOT NULL,
dataNasc DATE NOT NULL,
sexo VARCHAR(10) NOT NULL,
peso INT NOT NULL,
PRIMARY KEY (id)
)

CREATE TABLE veterinario (
id INT NOT NULL,
nome VARCHAR (150) NOT NULL,
cpf VARCHAR(20) NOT NULL,
crmv VARCHAR(30) NOT NULL,
telefone VARCHAR(20) NOT NULL,
especialidade VARCHAR(100) NULL,
sociEspecialista VARCHAR(100) NULL,
salario DECIMAL (7,2) NULL,
bancoHoras DECIMAL (4,2) NULL,
PRIMARY KEY (id)
)

CREATE TABLE historico (
numProntuario INT NOT NULL,
dataHora DATETIME NOT NULL,
diagnostico VARCHAR(MAX) NOT NULL,
descConsulta VARCHAR(MAX) NOT NULL,
observacoes VARCHAR(MAX) NOT NULL,
PRIMARY KEY (numProntuario)
)