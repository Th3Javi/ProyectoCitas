package com.prueba.optima.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.optima.entitys.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}