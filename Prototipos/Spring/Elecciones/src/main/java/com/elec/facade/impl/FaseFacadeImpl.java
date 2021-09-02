package com.elec.facade.impl;


import java.util.HashSet;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elec.beans.Evento;
import com.elec.beans.Fase;
import com.elec.dao.FaseDao;
import com.elec.forms.FaseForm;

@Service
public class FaseFacadeImpl implements com.elec.facade.FaseFacade {

  @Autowired
  private FaseDao faseDao;

  @Override
  public List < Fase > obtenerFasesOrdenadasPorPrioridad() {

    return faseDao.obtenerFasesEnOrden();
  }

  @Override
  public Fase obtenerFasePorId(Long idFase) {

    return faseDao.obtenerFasePorId(idFase);
  }

  @Override
  public void añadirFase(FaseForm faseForm) {
	  String formNombre= faseForm.getNombre();
	  Long formPrioridad= faseForm.getPrioridad();
    if (!formNombre.equals("") && formPrioridad!=null) {
      Fase nuevaFase = new Fase();
      nuevaFase.setNombre(formNombre);
      nuevaFase.setPrioridad(formPrioridad);
      nuevaFase.setEventos(new HashSet<Evento>());
      faseDao.guardarFase(nuevaFase);
    }
  }

  @Override
  public void eliminarFase(Long id) {
    faseDao.eliminarFase(id);
  }

  @Override
  public void modificarFase(Fase fase, FaseForm faseForm) {
    if (!faseForm.getNombre().equals("")  && faseForm.getPrioridad()!=null) {
    	fase.setNombre(faseForm.getNombre());
    	fase.setPrioridad(faseForm.getPrioridad());;
    	faseDao.guardarFase(fase);
    	   
    }

  }

}