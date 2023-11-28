package com.example.demo.Services;
import java.util.List;

// LivroService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LivroRepository;
import com.example.demo.domain.Livro;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public Livro detalhesLivro(Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    
}
