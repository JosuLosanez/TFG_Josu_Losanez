package com.elec.facade;

import java.util.List;

import com.elec.beans.Fase;
import com.elec.forms.FaseForm;

public interface FaseFacade {
	
	public List<Fase> obtenerFasesOrdenadasPorPrioridad();

	public Fase obtenerFasePorId(Long idFase);

	public void añadirFase(FaseForm faseForm);

	public void eliminarFase(Long id);

	public void modificarFase(Fase fase, FaseForm faseForm);

}
