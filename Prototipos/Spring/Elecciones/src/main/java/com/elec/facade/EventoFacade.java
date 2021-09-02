package com.elec.facade;


import java.util.List;
import java.util.Map;

import com.elec.beans.Evento;
import com.elec.beans.Fase;
import com.elec.forms.EventoForm;

public interface EventoFacade {
	
	public Evento obtenerEventoPorId(Long id);
	
	List<Evento> obtenerEventosDeFase(Fase fase);

	public void añadirEvento(EventoForm eventoForm, Fase fase);

	public void eliminarEveto(Long id);
	
	public Map<Fase,List<String>> obtenerMargenesDeFases(List<Fase> listaFases);

	public void modificarEvento(Evento evento, EventoForm eventoForm, Fase fase);

}
