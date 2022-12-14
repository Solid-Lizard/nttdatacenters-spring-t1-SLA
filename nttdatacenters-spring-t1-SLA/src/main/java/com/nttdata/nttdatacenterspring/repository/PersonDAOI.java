package com.nttdata.nttdatacenterspring.repository;

// IMPORTS //
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * PersonDAOI - Repositorio DAO que gestiona las personas. Extiende de JpaRepository
 * 
 * @see Person
 * 
 * @author Santiago López
 *
 */
@Repository
public interface PersonDAOI extends JpaRepository<Person, Integer>{	
	/**
	 * 
	 * findByNameAndSurname - Devuelve una persona con el mismo nombre y apellidos
	 * 
	 * @param name - Nombre
	 * @param surname - Apellido
	 * 
	 * @return Person - Persona coincidente
	 * 
	 */
	Person findByNameAndSurname(String name, String surname);
}
