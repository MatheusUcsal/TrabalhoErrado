package com.example.demo.Services;
// UsuarioService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UsuarioRepository;
import com.example.demo.domain.Usuario;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public void compartilharLivro(Long livroId, Long usuarioId) {
        // Lógica para compartilhar livro
    }
    
}
