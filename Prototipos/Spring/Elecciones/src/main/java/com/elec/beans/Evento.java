package com.elec.beans;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name="Eventos")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvento;

	@JoinColumn(name = "idFase")
	@ManyToOne(fetch = FetchType.LAZY)
	private Fase fase;
	
	@Column(name="fechaInicio")
	private Date fechaInicio;
	
	@Column(name="fechaFin")
	private Date fechaFin;
	
	@Column(name="fechaTexto")
	private String fechaTexto;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="ley")
	private String ley;
	
	public Evento() {
		super();
	}

	public Evento(Long idEvento, Fase pFase, Date fechaInicio, Date fechaFin, String fechaTexto, String titulo,
			String ley) {
		this.idEvento = idEvento;
		this.fase = pFase;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaTexto = fechaTexto;
		this.titulo = titulo;
		this.ley = ley;
	}



	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Fase getPFase() {
		return fase;
	}

	public void setPFase(Fase pFase) {
		this.fase = pFase;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaTexto() {
		return fechaTexto;
	}

	public void setFechaTexto(String fechaTexto) {
		this.fechaTexto = fechaTexto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLey() {
		return ley;
	}

	public void setLey(String ley) {
		this.ley = ley;
	}
	
	


	
}
