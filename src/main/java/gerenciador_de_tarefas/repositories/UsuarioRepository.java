package gerenciador_de_tarefas.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import gerenciador_de_tarefas.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
