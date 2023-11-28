package com.example.demo.Controllers;

import java.util.List;

// UsuarioController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Services.UsuarioService;
import com.example.demo.domain.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping("/compartilhar/{livroId}")
    public ResponseEntity<Void> compartilharLivro(@PathVariable Long livroId, @RequestBody Long usuarioId) {
        usuarioService.compartilharLivro(livroId, usuarioId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
