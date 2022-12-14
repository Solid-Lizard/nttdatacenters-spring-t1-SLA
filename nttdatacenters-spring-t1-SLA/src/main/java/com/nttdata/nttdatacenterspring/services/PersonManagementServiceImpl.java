package com.nttdata.nttdatacenterspring.services;

// IMPORTS //
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.nttdatacenterspring.repository.Person;
import com.nttdata.nttdatacenterspring.repository.PersonDAOI;

/**
 * 
 * PersonManagementServiceImpl - Servicio implmentación de "PersonManagementServiceI"
 * 
 * @see PersonManagementServiceI
 * 
 * @author Santiago López
 *
 */
@Service
public class PersonManagementServiceImpl implements PersonManagementServiceI {	
	// ATRIBUTOS //
	/**
	 * Repositorio: Gestión de personas
	 * 
	 * @see PersonDAOI
	 */
	@Autowired
	private PersonDAOI personDao;
	
	/**
	 * Logger: Log de la clase
	 */
	private static final Logger LOG = LoggerFactory.getLogger(PersonManagementServiceImpl.class);
	
	// MÉTODOS //
	// Constructor //
	/**
	 * 
	 * PersonManagementServiceImpl - Constructor vacío
	 * 
	 */
	public PersonManagementServiceImpl() {
		// Constructor vacío
	}
	
	// CRUD //
	
	// Create //
	@Override
	public void create(Person p) {	
		LOG.warn("Almacenando persona: {}", p.getDni());
		
		personDao.save(p);
		
		LOG.warn("Persona almacenada satisfactoriamente");
		
	}
		
	// Read //
	@Override
	public Person searchByNameAndSurname(String name, String surname) {
		LOG.warn("Buscando persona por nombre y apellidos: {} {}", name, surname);
		
		Person p = personDao.findByNameAndSurname(name, surname);
		
		LOG.warn("Persona encontrada satisfactoriamente, devuelta: {}", p.getDni());
		
		return p;
	}

	@Override
	public List<Person> searchAllEmployees() {		
		LOG.warn("Buscando todos los empleados");
		
		List<Person> res = personDao.findAll();
		
		LOG.warn("Empleados buscados satisfactoriamenre, devueltos: {}", res);
		
		return res;
	}	

	// Update //
	@Override
	public void update(Person p) {
		LOG.warn("Actualizando persona: {}", p.getDni());
		
		personDao.save(p);
		
		LOG.warn("Persona actualizada satisfactoriamente");
		
	}

	// Delete //
	@Override
	public void delete(Person p) {
		LOG.warn("Eliminando persona {}", p.getDni());
		
		personDao.delete(p);
		
		LOG.warn("Persona eliminada satisfactoriamente");
		
	}

	@Override
	public void deleteAll() {
		LOG.warn("Eliminando todos los empleados");
		
		personDao.deleteAll();
		
		LOG.warn("Personas eliminadas satisfactoriamente");
		
	}
	
	
}
