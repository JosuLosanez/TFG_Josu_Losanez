package com.elec.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.elec.beans.Evento;
import com.elec.beans.Fase;
import com.elec.dao.EventoDao;
import com.elec.repository.EventoRepo;

@Repository
public class EventoDaoImpl implements EventoDao {

	@Autowired
	private EventoRepo EventoRepo;
	
	
	@Override
	public Evento obtenerEventoPorId(Long id) {
		return EventoRepo.findByIdEvento(id);
	}


	@Override
	public List<Evento> obtenerEventosDeFase(Fase fase) {
		return EventoRepo.findByFaseOrderByFechaFinAsc(fase);
	}


	@Override
	public void guardarEvento(Evento nuevoEvento) {
		EventoRepo.save(nuevoEvento);
		
	}


	@Override
	public void eliminarEvento(Long id) {
		EventoRepo.deleteById(id);
	}


	@Override
	public Date obtenerMagenFinDeFase(Long idFase) {
		
		
		return EventoRepo.getDateFinFase(idFase);
	}


	@Override
	public Date obtenerMagenInicioDeFase(Long idFase) {
		
		return EventoRepo.getDateInicioFase(idFase);
	}



}
