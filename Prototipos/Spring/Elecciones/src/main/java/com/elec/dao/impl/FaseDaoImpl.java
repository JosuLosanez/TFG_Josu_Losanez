package com.elec.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.elec.beans.Fase;
import com.elec.dao.FaseDao;
import com.elec.repository.FaseRepo;

@Repository
public class FaseDaoImpl implements FaseDao {

	@Autowired
	private FaseRepo faseRepo;
	
	
	@Override
	public List<Fase> obtenerFasesEnOrden() {
		
		return faseRepo.findAllByOrderByPrioridadAsc();
	}


	@Override
	public Fase obtenerFasePorId(Long idFase) {

		return faseRepo.findByIdFase(idFase);
	}


	@Override
	public void guardarFase(Fase nuevaFase) {
		
		faseRepo.save(nuevaFase);	
	}


	@Override
	public void eliminarFase(Long id) {
		faseRepo.deleteById(id);
		
	}

}
