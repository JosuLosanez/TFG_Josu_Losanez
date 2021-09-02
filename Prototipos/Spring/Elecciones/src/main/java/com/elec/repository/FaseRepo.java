package com.elec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elec.beans.Fase;

public interface FaseRepo extends JpaRepository<Fase, Long>{
	
	List<Fase> findAllByOrderByPrioridadAsc();
	
	Fase findByIdFase(Long IdFase);

}
