CREATE DATABASE IF NOT EXISTS fat; -- Cria o banco de dados 

USE fat; -- Seleciona esse banco para trabalhar

-- Cria a tabela onde os dados serão armazenados
CREATE TABLE IF NOT EXISTS alunos (
    codigo_aluno VARCHAR(10) NOT NULL PRIMARY KEY, -- Código único do aluno (chave primária)
    nome_aluno   VARCHAR(100) NOT NULL             -- Nome do aluno
);

-- Insere alunos de exemplo.
INSERT INTO alunos (codigo_aluno, nome_aluno) VALUES
('1001', 'Maria'), -- aluno 1
('1002', 'João Pedro'), -- aluno 2

-- Mostra todos os registros da tabela "alunos"
SELECT * FROM alunos;
