CREATE TABLE animal_domestico (
nome VARCHAR (50) NOT NULL,
rga INT NOT NULL,
especie VARCHAR(50) NOT NULL,
raca VARCHAR(50) NOT NULL,
dataNasc DATE NOT NULL,
sexo VARCHAR(10) NOT NULL,
peso INT NOT NULL,
PRIMARY KEY (rga)
)

CREATE TABLE cliente (
nome VARCHAR (150) NOT NULL,
cpf VARCHAR(20) NOT NULL,
endereco VARCHAR(MAX) NOT NULL,
telefone VARCHAR(15) NOT NULL,
email VARCHAR(50) NOT NULL,
rga_animal INT NOT NULL,
PRIMARY KEY (cpf),
FOREIGN KEY (rga_animal) REFERENCES animal_domestico(rga)
)

CREATE TABLE veterinario (
nome VARCHAR (150) NOT NULL,
cpf VARCHAR(20) NOT NULL,
crmv VARCHAR(30) NOT NULL,
telefone VARCHAR(20) NOT NULL,
salario DECIMAL (7,2) NULL,
bancoHoras DECIMAL (4,2) NULL,
PRIMARY KEY (crmv)
)

CREATE TABLE especialista (
nome VARCHAR (150) NOT NULL,
cpf VARCHAR(20) NOT NULL,
crmv VARCHAR(30) NOT NULL,
telefone VARCHAR(20) NOT NULL,
especialidade VARCHAR(100) NULL,
sociEspecialista VARCHAR(100) NULL,
salario DECIMAL (7,2) NULL,
bancoHoras DECIMAL (4,2) NULL,
PRIMARY KEY (crmv)
)

CREATE TABLE historico_consulta (
numProntuario INT NOT NULL,
dataHora DATETIME NOT NULL,
diagnostico VARCHAR(MAX) NOT NULL,
descConsulta VARCHAR(MAX) NOT NULL,
observacoes VARCHAR(MAX) NOT NULL,
PRIMARY KEY (numProntuario)
)

CREATE TABLE historico_exame (
data_pedido DATETIME NOT NULL,
tipo VARCHAR (100) NOT NULL,
data_coleta DATETIME NULL,
resultado VARCHAR(MAX) NULL,
numProntuario_consulta INT NULL,
FOREIGN KEY (numProntuario_consulta) REFERENCES historico_consulta(numProntuario)
)