package gerenciador_de_tarefas.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import gerenciador_de_tarefas.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, UUID> {

}
