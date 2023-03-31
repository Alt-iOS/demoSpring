package com.desarrollo.demospring.repositories;

import com.desarrollo.demospring.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByNombre(String name);
}