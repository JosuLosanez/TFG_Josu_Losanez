package com.elec.forms;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;




public class EventoForm {

	private Long idEvento;
	private Long idFase;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date fechaInicio;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date fechaFin;
	
	private String fechaTexto;
	private String titulo;
	private String ley;
	
	public Long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}
	public Long getIdFase() {
		return idFase;
	}
	public void setIdFase(Long idFase) {
		this.idFase = idFase;
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
