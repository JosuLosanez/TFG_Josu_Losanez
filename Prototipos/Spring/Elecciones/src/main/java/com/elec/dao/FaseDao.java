package com.elec.dao;

import java.util.List;

import com.elec.beans.Fase;

public interface FaseDao {
	
	List<Fase> obtenerFasesEnOrden();

	Fase obtenerFasePorId(Long idFase);

	void guardarFase(Fase nuevaFase);

	void eliminarFase(Long id);
	

}
