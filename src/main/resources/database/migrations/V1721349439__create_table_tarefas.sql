CREATE TABLE tarefas (
	id uuid NOT NULL PRIMARY KEY,
	id_usuario uuid NOT NULL,
	nome varchar NOT NULL UNIQUE,
	descricao varchar NOT NULL UNIQUE,
	criada_em timestamptz NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE
);