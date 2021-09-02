package com.elec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;






@Controller
public class WebController {
 
	@RequestMapping("/")
	String inicioLogin() {

	  
		return "inicio";
		
  }
	

  

  


  
}