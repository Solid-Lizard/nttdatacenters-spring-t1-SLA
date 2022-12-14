package com.nttdata.nttdatacenterspring.controllers;

// IMPORTS //
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * HomeController - Controlador de bienvenida a la aplicación
 * 
 * @author Santiago López
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	// MÉTODOS //
	/**
	 * 
	 * saludos - Devuelve un mensaje de bienvenida a la aplicación
	 * 
	 * @return String - Mensaje de bienvenida
	 * 
	 */
	@GetMapping("/")
	public @ResponseBody String saludos() {
		return "¡Hola!, si quieres probar el controlador de ejemplo que busca una persona, porfavor, dirígete a /prueba/buscar";
	}
}
