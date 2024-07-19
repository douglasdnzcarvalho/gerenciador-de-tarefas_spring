package gerenciador_de_tarefas.validators;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarUsuarioValidator {
	@NotNull
	@NotBlank
	@Size(min=1)
	private String nome;

	@NotNull
    @Email
	private String email;

	@NotNull
	@NotBlank
	@Size(min=1)
	private String senha;
}