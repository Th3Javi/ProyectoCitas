package com.prueba.optima.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.optima.entitys.Cita;
import com.prueba.optima.services.CitaService;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping
    public ResponseEntity<Cita> crearCita(@RequestBody Cita cita) {
        return ResponseEntity.ok(citaService.crearCita(cita));
    }

    @PutMapping("/{citaId}/asignar/{agenteId}")
    public ResponseEntity<Cita> asignarCita(@PathVariable Long citaId, @PathVariable Long agenteId) {
        return ResponseEntity.ok(citaService.asignarCita(citaId, agenteId));
    }

    @PutMapping("/{citaId}/completar")
    public ResponseEntity<Cita> completarCita(@PathVariable Long citaId) {
        return ResponseEntity.ok(citaService.completarCita(citaId));
    }

    @PutMapping("/{citaId}/reabrir")
    public ResponseEntity<Cita> reabrirCita(@PathVariable Long citaId) {
        return ResponseEntity.ok(citaService.reabrirCita(citaId));
    }
}