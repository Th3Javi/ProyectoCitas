package com.prueba.optima.entitys;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaRegistro;
    private String proyecto;
    private String consulta;

    @ManyToOne
    private Usuario agente;

    @Enumerated(EnumType.STRING)
    private EstadoCita estado;

    private LocalDate fechaAsignacion;
    private LocalDate fechaCerrado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public Usuario getAgente() {
		return agente;
	}
	public void setAgente(Usuario agente) {
		this.agente = agente;
	}
	public EstadoCita getEstado() {
		return estado;
	}
	public void setEstado(EstadoCita estado) {
		this.estado = estado;
	}
	public LocalDate getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(LocalDate fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public LocalDate getFechaCerrado() {
		return fechaCerrado;
	}
	public void setFechaCerrado(LocalDate fechaCerrado) {
		this.fechaCerrado = fechaCerrado;
	}

}