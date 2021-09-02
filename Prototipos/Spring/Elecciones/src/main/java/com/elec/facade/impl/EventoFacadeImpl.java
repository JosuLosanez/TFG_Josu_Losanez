package com.elec.facade.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elec.beans.Evento;
import com.elec.beans.Fase;
import com.elec.dao.EventoDao;
import com.elec.forms.EventoForm;

@Service
public class EventoFacadeImpl implements com.elec.facade.EventoFacade {

	@Autowired
	private EventoDao EventoDao;
	
	@Override
	public Evento obtenerEventoPorId(Long id) {
		return EventoDao.obtenerEventoPorId(id);
	}

	@Override
	public List<Evento> obtenerEventosDeFase(Fase fase) {
		return EventoDao.obtenerEventosDeFase(fase);
	}

	@Override
	public void añadirEvento(EventoForm eventoForm,Fase fase) {

		if (eventoForm.getFechaFin() != null && eventoForm.getFechaInicio() != null && 
				eventoForm.getFechaTexto() != null && eventoForm.getLey() != null
				&& eventoForm.getTitulo()!= null) {
			
			Evento nuevoEvento = new Evento();
			nuevoEvento.setFechaFin(eventoForm.getFechaFin());
			nuevoEvento.setFechaInicio(eventoForm.getFechaInicio());
			nuevoEvento.setFechaTexto(eventoForm.getFechaTexto());
			nuevoEvento.setLey(eventoForm.getLey());
			nuevoEvento.setTitulo(eventoForm.getTitulo());
			nuevoEvento.setPFase(fase);
			
			EventoDao.guardarEvento(nuevoEvento);
			
		}	
	}

	@Override
	public void eliminarEveto(Long id) {
		EventoDao.eliminarEvento(id);	
	}

	@Override
	public Map<Fase, List<String>> obtenerMargenesDeFases(List<Fase> listaFases) {
		
		Map<Fase,List<String>> mapAux =  new HashMap<>();
		for (int i = 0; i < listaFases.size(); i++) {
				
			Fase fase = listaFases.get(i);
			Date fechaInicio =EventoDao.obtenerMagenInicioDeFase(fase.getIdFase());
			Date fechaFin =  EventoDao.obtenerMagenFinDeFase(fase.getIdFase());
			List<String> auxMagenes = new ArrayList<>();
			
			if ( fechaInicio != null && fechaFin != null) {
				String fechaInicioString = fechaInicio.toString().split(" ")[0];
				String fechaFinString = fechaFin.toString().split(" ")[0];
				
				auxMagenes.add(fechaInicioString);
				auxMagenes.add(fechaFinString);
			}
			else {
				auxMagenes.add("");
				auxMagenes.add("");				
			}	
			mapAux.put(fase,auxMagenes);		
		}
		return mapAux;
	}

	@Override
	public void modificarEvento(Evento evento,EventoForm eventoForm, Fase fase) {
		if (eventoForm.getFechaFin() != null && eventoForm.getFechaInicio() != null && 
				eventoForm.getFechaTexto() != null && eventoForm.getLey() != null
				&& eventoForm.getTitulo()!= null) {
			
			evento.setFechaFin(eventoForm.getFechaFin());
			evento.setFechaInicio(eventoForm.getFechaInicio());
			evento.setFechaTexto(eventoForm.getFechaTexto());
			evento.setLey(eventoForm.getLey());
			evento.setTitulo(eventoForm.getTitulo());
			evento.setPFase(fase);
	
			EventoDao.guardarEvento(evento);

			
		}
		
	}

}
