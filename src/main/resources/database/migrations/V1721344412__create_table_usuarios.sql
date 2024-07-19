CREATE TABLE usuarios (
	id uuid NOT NULL PRIMARY KEY,
	nome varchar NOT NULL UNIQUE,
	email varchar NOT NULL UNIQUE,
	senha varchar NOT NULL UNIQUE,
	criado_em timestamptz NOT NULL
);