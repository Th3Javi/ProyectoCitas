package com.prueba.optima.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.optima.entitys.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {}