package com.nttdata.nttdatacenterspring.services;

// IMPORTS //
import java.util.List;

import com.nttdata.nttdatacenterspring.repository.Person;



/**
 * 
 * PersonManagementServiceI - Servicio de gestión de operaciones con la entidad Persona.
 * 
 * @see Person
 * 
 * @author Santiago López
 *
 */
public interface PersonManagementServiceI {
	/**
	 * 
	 * create - Inserta una Planta en la BDD
	 * 
	 * @param f - Planta
	 * 
	 */
	public void create(Person p);
	
	/**
	 * 
	 * searchByNameAndSurname - Llama al repositorio de gestión de personas para buscar una persona con 
	 * los parámetros indicados
	 * 
	 * @param name - Nombre
	 * @param surname - Apellido
	 * 
	 * @see Person
	 * @see PersonDAOI
	 * 
	 * @return Person - Persona coincidente
	 * 
	 */
	public Person searchByNameAndSurname(String name, String surname);
	
	/**
	 * 
	 * searchAllEmployees - Llama al repositorio de gestión de personas para devolver una lista con todas 
	 * las personas del edificio
	 * 
	 * @see Person
	 * @see PersonDAOI
	 * 
	 * @return List - Lista de personas
	 * 		 
	 */
	public List<Person> searchAllEmployees();
	
	/**
	 * 
	 * update - Llama al repositorio de gestión de personas para modificar los datos de una persona dada
	 * 
	 * @see Person
	 * @see PersonDAOI
	 * 
	 * @param p - Persona
	 * 
	 */
	public void update(Person p);
	
	/**
	 * 
	 * delete - Llama al repositorio de gestión de personas para eliminar una persona dada
	 * 
	 * @see Person
	 * @see PersonDAOI
	 * 
	 * @param p . Persona
	 * 
	 */
	public void delete(Person p);
	
	/**
	 * 
	 * deleteAll - Llama al repositorio de gestión de personas para eliminar todas las personas
	 * existentes en la BDD
	 * 
	 * @see Person
	 * @see PersonDAOI
	 * 
	 */
	public void deleteAll();
}
