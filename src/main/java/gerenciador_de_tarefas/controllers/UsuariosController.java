package gerenciador_de_tarefas.controllers;

import org.springframework.web.bind.annotation.RestController;

import gerenciador_de_tarefas.models.Usuario;
import gerenciador_de_tarefas.repositories.UsuarioRepository;
import gerenciador_de_tarefas.validators.CriarUsuarioValidator;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private final UsuarioRepository repository;

    public UsuariosController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping("")
    public Usuario cadastrar(
        @RequestBody @Valid CriarUsuarioValidator dados
    ) {
        Usuario usuario = new Usuario();
        usuario.setNome(dados.getNome());
        usuario.setEmail(dados.getEmail());
        usuario.setSenha(dados.getSenha());
        this.repository.save(usuario);

        return usuario;
    }
}
