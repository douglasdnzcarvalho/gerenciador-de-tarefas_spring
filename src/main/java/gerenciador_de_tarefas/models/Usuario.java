package gerenciador_de_tarefas.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;

    @CreationTimestamp
    private LocalDateTime criado_em;
}
