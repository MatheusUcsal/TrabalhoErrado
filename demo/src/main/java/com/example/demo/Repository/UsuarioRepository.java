package com.example.demo.Repository;

// UsuarioRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 
}
