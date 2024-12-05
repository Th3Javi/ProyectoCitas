package com.prueba.optima.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.optima.entitys.Cita;
import com.prueba.optima.entitys.EstadoCita;
import com.prueba.optima.entitys.Usuario;
import com.prueba.optima.repositorys.CitaRepository;
import com.prueba.optima.repositorys.UsuarioRepository;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Cita crearCita(Cita cita) {
        cita.setFechaRegistro(LocalDate.now());
        cita.setEstado(EstadoCita.PENDIENTE);
        return citaRepository.save(cita);
    }

    public Cita asignarCita(Long citaId, Long agenteId) {
        Cita cita = citaRepository.findById(citaId).orElseThrow();
        Usuario agente = usuarioRepository.findById(agenteId).orElseThrow();
        cita.setAgente(agente);
        cita.setFechaAsignacion(LocalDate.now());
        cita.setEstado(EstadoCita.ASIGNADA);
        return citaRepository.save(cita);
    }

    public Cita completarCita(Long citaId) {
        Cita cita = citaRepository.findById(citaId).orElseThrow();
        cita.setFechaCerrado(LocalDate.now());
        cita.setEstado(EstadoCita.COMPLETADA);
        return citaRepository.save(cita);
    }

    public Cita reabrirCita(Long citaId) {
        Cita cita = citaRepository.findById(citaId).orElseThrow();
        cita.setEstado(EstadoCita.ABIERTA);
        return citaRepository.save(cita);
    }
}