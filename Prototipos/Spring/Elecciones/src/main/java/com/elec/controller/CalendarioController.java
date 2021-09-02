package com.elec.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elec.beans.Evento;
import com.elec.beans.Fase;
import com.elec.facade.EventoFacade;
import com.elec.facade.FaseFacade;
import com.elec.forms.SearchEventoForm;
import com.elec.forms.EventoForm;
import com.elec.forms.FaseForm;

@RequestMapping("/calendario")
@Controller
public class CalendarioController {
	
	@Autowired
	private FaseFacade faseFacade;
	
	@Autowired
	private EventoFacade eventoFacade;
 
	  @RequestMapping("")
	  public String listaCalendario(Model model) {
		  List<Map<Fase,List<Evento>>> listaMapas = new ArrayList<>();
		  List<Fase> fases = faseFacade.obtenerFasesOrdenadasPorPrioridad();
		  	
		  for (int i = 0; i < fases.size(); i++) {
			  Map<Fase,List<Evento>> MapAux = new HashMap<>();
			  Fase fase = fases.get(i);
			  List<Evento> eventos = eventoFacade.obtenerEventosDeFase(fase); 
			 
			  MapAux.put(fase, eventos);
			  listaMapas.add(MapAux);
		  }
	
		  model.addAttribute("ListaM", listaMapas); 
		  model.addAttribute("MapMargenes",eventoFacade.obtenerMargenesDeFases(fases) );
		  		  
	    return "listaCalendario";
	  }
	  
	  // Mantenimiento de Eventos
	  
	  @RequestMapping(value = "/mantenimiento/searchEvento",method = { RequestMethod.GET, RequestMethod.POST }) 
	  public String searchEvento(@ModelAttribute SearchEventoForm searchEventoForm,Model model) {   
		  
		  Fase currentFase = faseFacade.obtenerFasePorId(searchEventoForm.getIdFase());
		  if (currentFase !=null) {
			  List<Evento> eventosF = eventoFacade.obtenerEventosDeFase(currentFase); 
			  
			  model.addAttribute("FaseNombre", currentFase.getNombre());
			  model.addAttribute("ListaEventos", eventosF);
		  }
		 
		  model.addAttribute("ListaFases", faseFacade.obtenerFasesOrdenadasPorPrioridad()); 
		  model.addAttribute("SearchEventoForm", new SearchEventoForm()); 

		  	  
	    return "searchEvento";
	  }
	  
	  @RequestMapping(value = "/mantenimiento/addEvento", method = { RequestMethod.GET, RequestMethod.POST }) 
	  public String addEventoForm(@ModelAttribute EventoForm eventoForm,Model model) {   
		  if(eventoForm.getFechaFin()!=null) {
			  eventoFacade.añadirEvento(eventoForm,faseFacade.obtenerFasePorId(eventoForm.getIdFase()));
		  }
		  model.addAttribute("ListaFases", faseFacade.obtenerFasesOrdenadasPorPrioridad()); 
		  model.addAttribute("EventoForm", new EventoForm()); 
		  	  
		  return "addEvento";
	  }
	  	  
	  @RequestMapping(value = "/mantenimiento/updateEvento/{id}", method = { RequestMethod.GET, RequestMethod.POST }) 
	  public String updateEventoForm(@PathVariable("id") Long id,@ModelAttribute EventoForm eventoForm,Model model) {   
		  if(eventoForm.getFechaFin()!=null) {
			  Evento evento = eventoFacade.obtenerEventoPorId(id);
			  eventoFacade.modificarEvento(evento,eventoForm,faseFacade.obtenerFasePorId(eventoForm.getIdFase()));
			  
			  return "redirect:/calendario/mantenimiento/searchEvento";
		  }
			
		  model.addAttribute("Evento", eventoFacade.obtenerEventoPorId(id)); 
		  model.addAttribute("ListaFases", faseFacade.obtenerFasesOrdenadasPorPrioridad()); 
		  model.addAttribute("EventoForm", new EventoForm()); 
		  
		  return "updateEvento";
	  }
	  
	  @RequestMapping("/mantenimiento/deleteEvento/{id}")
	  public String deleteEvento(@PathVariable("id") Long id,Model model){
		  eventoFacade.eliminarEveto(id);		
		  return "redirect:/calendario/mantenimiento/searchEvento";
	  }
		
		
	  // Mantenimiento de Fases
	  
	  @RequestMapping(value = "/mantenimiento/listaFase",method = { RequestMethod.GET, RequestMethod.POST }) 
	  public String listaFases(@ModelAttribute FaseForm faseForm,Model model) {    
		  
		  model.addAttribute("ListaFases", faseFacade.obtenerFasesOrdenadasPorPrioridad()); 
		 
		  return "listaFase";
	  }
		
	  @RequestMapping(value = "/mantenimiento/addFase", method = { RequestMethod.GET, RequestMethod.POST }) 
	  public String addFaseForm(@ModelAttribute FaseForm faseForm,Model model) {   
		  if(faseForm.getNombre()!=null) {
			  faseFacade.añadirFase(faseForm);		  
		  }
		  
		  model.addAttribute("FaseForm", new FaseForm()); 
		  
		  return "addFase";
	  }
		
	  @RequestMapping(value = "/mantenimiento/updateFase/{id}", method = { RequestMethod.GET, RequestMethod.POST }) 
	  public String updateFaseForm(@PathVariable("id") Long id,@ModelAttribute FaseForm faseForm,Model model) {   
		  if(faseForm.getNombre()!=null) {
			  faseFacade.modificarFase(faseFacade.obtenerFasePorId(id),faseForm);
			  
			  return "redirect:/calendario/mantenimiento/listaFase";
		  }
		
		  model.addAttribute("Fase", faseFacade.obtenerFasePorId(id)); 
		  model.addAttribute("FaseForm", new FaseForm()); 
		  
		  return "updateFase";
	  }
	  	 
	  @RequestMapping("/mantenimiento/deleteFase/{id}")
	  public String deleteFase(@PathVariable("id") Long id,Model model){
		  
		  faseFacade.eliminarFase(id);		
		
		  return "redirect:/calendario/mantenimiento/listaFase";
	  }
		 
		 
}