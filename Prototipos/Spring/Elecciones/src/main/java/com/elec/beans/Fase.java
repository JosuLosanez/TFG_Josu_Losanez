package com.elec.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="fases")
public class Fase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFase;
	
	@NotNull
	@Column(name="nombre")
	private String nombre;
	
	@NotNull
	@Column(name="prioridad")
	private Long prioridad;
	
	@NotNull
	@OneToMany(mappedBy = "fase", cascade = CascadeType.REMOVE)
    private Set<Evento> eventos;

	public Fase() {
		super();
	}

	public Fase(Long idFase, String nombre, Long prioridad, Set<Evento> eventos) {
		super();
		this.idFase = idFase;
		this.nombre = nombre;
		this.prioridad = prioridad;
		this.eventos = eventos;
	}

	public Long getIdFase() {
		return idFase;
	}

	public void setIdFase(Long idFase) {
		this.idFase = idFase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Long prioridad) {
		this.prioridad = prioridad;
	}

	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}
	
	

	
}
