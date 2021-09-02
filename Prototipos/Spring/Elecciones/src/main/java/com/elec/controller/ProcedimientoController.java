package com.elec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/procedimiento")
@Controller
public class ProcedimientoController {
	  
	  @RequestMapping("/convocatoria")
	  String convocatoriaVista() {
	    return "convocatoria";
	  }
	  
	  @RequestMapping("/juntas")
	  String juntasVista() {
	    return "juntas";
	  }
	  
	  @RequestMapping("/candidaturas")
	  String candidaturaVista() {
	    return "candidaturas";
	  }

  
}