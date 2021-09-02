package com.elec.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.elec.beans.Evento;
import com.elec.beans.Fase;

public interface EventoRepo extends JpaRepository<Evento, Long>{
	
	Evento findByIdEvento(Long id);
	
	List<Evento> findByFaseOrderByFechaFinAsc(Fase fase);

	@Query(value= " SELECT MAX(fecha_fin) FROM eventos WHERE id_fase =:idFase", nativeQuery=true)
	Date getDateFinFase(Long idFase);

	@Query(value= " SELECT MIN(fecha_inicio) FROM eventos WHERE id_fase =:idFase", nativeQuery=true)
	Date getDateInicioFase(Long idFase);
	
	
	
}
