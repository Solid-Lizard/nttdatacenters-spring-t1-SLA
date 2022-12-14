package com.nttdata.nttdatacenterspring.controllers;

// IMPORTS //
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.nttdatacenterspring.services.PersonManagementServiceI;

/**
 * 
 * ExampleController - Controlador de ejemplo que muestra todas las personas existentes en la BDD. Para ello emplea el servicio
 * de gestión de personas
 * 
 * @see Person
 * @see PersonManagamentServiceImpl
 * 
 * @author Santiago López
 *
 */
@Controller
@RequestMapping("/prueba")
public class ExampleController {
	// ATRIBUTOS //
	/**
	 * Servicio: Servicio de gestión de personas
	 */
	@Autowired
	PersonManagementServiceI personService;
	
	// MÉTODOS //
	/**
	 * 
	 * buscar - Realiza y devuelve una consulta de todas las personas existentes en la BDD
	 * 
	 * @return String - Personas en la BDD
	 */
	@GetMapping("/buscar")
	public @ResponseBody String buscar() {								
		return personService.searchAllEmployees().toString();
		
	}
		
	
}
