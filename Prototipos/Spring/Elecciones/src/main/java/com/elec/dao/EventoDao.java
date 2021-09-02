package com.elec.dao;

import java.util.Date;
import java.util.List;

import com.elec.beans.Evento;
import com.elec.beans.Fase;

public interface EventoDao {
	
	Evento obtenerEventoPorId(Long id);
	
	List<Evento> obtenerEventosDeFase(Fase fase);

	void guardarEvento(Evento nuevoEvento);

	void eliminarEvento(Long id);

	Date obtenerMagenFinDeFase(Long idFase);

	Date obtenerMagenInicioDeFase(Long idFase);


}
