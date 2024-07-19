package gerenciador_de_tarefas.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private UUID id_usuario;

    private String nome;

    private String descricao;

    @CreationTimestamp
    private LocalDateTime criada_em;
}