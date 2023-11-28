package com.example.demo.Repository;
// LivroRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Livro;

// LivroRepository.java
public interface LivroRepository extends JpaRepository<Livro, Long> {
    
}
