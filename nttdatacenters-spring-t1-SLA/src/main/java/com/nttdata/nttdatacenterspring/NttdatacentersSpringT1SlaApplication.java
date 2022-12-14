package com.nttdata.nttdatacenterspring;

//IMPORTS //
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import com.nttdata.nttdatacenterspring.repository.Flat;
import com.nttdata.nttdatacenterspring.repository.Floor;
import com.nttdata.nttdatacenterspring.repository.Person;
import com.nttdata.nttdatacenterspring.services.FlatManagementServiceI;
import com.nttdata.nttdatacenterspring.services.FloorManagementServiceI;
import com.nttdata.nttdatacenterspring.services.PersonManagementServiceI;

/**
 * 
 * NttdatacentersSpringT1SlaApplication - Clase pincipal de la aplicación
 * 
 * @author Santiago López
 *
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////
// ANTES DE COMENZAR, COMPRUEBE QUE LA CONGIFURACIÓN PARA LA CONEXIÓN A UNA BDD MYSQL SON CORRECTOS //
// CONFIGURACIÓN EN: src>main>resources>aplication.properties										//
//////////////////////////////////////////////////////////////////////////////////////////////////////

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication
public class NttdatacentersSpringT1SlaApplication implements CommandLineRunner{
	// ATRIBUTOS //	
	/**
	 * Logger: Log de la clase principal
	 */
	private static final Logger LOG = LoggerFactory.getLogger(NttdatacentersSpringT1SlaApplication.class);
	
	// IMPLEMENTACIÓN DE SERVICIOS //
	/**
	 * Servicio: Gestión de personas
	 */
	@Autowired
	PersonManagementServiceI personService;
	
	/**
	 * Servicio: Gestión de plantas
	 */
	@Autowired
	FloorManagementServiceI floorService;
	
	/**
	 * Servicio: Servicio de pisos
	 */
	@Autowired
	FlatManagementServiceI flatService;
	
	// MÉTODOS //
	/**
	 * 
	 * main - Método principal de la aplicación
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		LOG.warn("Inicio de traza");		
		SpringApplication.run(NttdatacentersSpringT1SlaApplication.class, args);
		LOG.warn("Fin de traza");				
	}

	@Override
	public void run(String... args) throws Exception {	
		// Creacion de plantas //
		LOG.warn("Iniciando creación de plantas");
		/**
		 * Objeto: Planta 1
		 */
		Floor fl1 = new Floor();	
		fl1.setBuzon(1);
		
		/**
		 * Objeto: Planta 1
		 */
		Floor fl2 = new Floor();
		fl2.setBuzon(2);	
		
		LOG.warn("Plantas creadas satisfactoriamente");
		
		// Creacion de pisos //
		LOG.warn("Iniciando creación de pisos");
		/**
		 * Objeto: Piso 1
		 */		
		Flat f1 = new Flat();		
		f1.setFloor(fl1);
		
		fl1.addFlat(f1);
		
		/**
		 * Objeto: Piso 2
		 */
		Flat f2 = new Flat();
		f2.setFloor(fl1);
		
		fl1.addFlat(f2);
		
		/**
		 * Objeto: Piso 3
		 */
		Flat f3 = new Flat();
		f3.setFloor(fl2);
		
		fl2.addFlat(f3);
		
		LOG.warn("Pisos creados satisfactoriamente");
		
		// Creacion de personas //
		LOG.warn("Iniciando creación de personas");
		/**
		 * Objeto: Persona 1
		 */
		Person p1 = new Person();
		p1.setDni("12345678a");
		p1.setName("Santiago");
		p1.setSurname("Lopez");	
		p1.setFlat(f1);
		
		/**
		 * Objeto: Persona 2
		 */
		Person p2 = new Person();
		p2.setDni("87654321a");
		p2.setName("Juan");
		p2.setSurname("Perez");
		p2.setFlat(f2);
			
		/**
		 * Objeto: Persona 3
		 */
		Person p3 = new Person();
		p3.setDni("12332156a");
		p3.setName("Bruce");
		p3.setSurname("Wayne");
		p3.setFlat(f3);
		
		/**
		 * Objeto: Persona 4
		 */
		Person p4 = new Person();
		p4.setDni("11122233a");
		p4.setName("Wade");
		p4.setSurname("Wilson");
		p4.setFlat(f1);		
				
		LOG.warn("Personas creadas satisfactoriamente");
		
		// CONSUMIR SERVICIOS //
		LOG.warn("Realizando inserción de entidades");
		// Inserción de plantas //
		floorService.create(fl1);
		floorService.create(fl2);
		
		LOG.warn("Plantas insertadas satisfactoriamente");
		
		// Inserción de pisos //
		flatService.create(f1);
		flatService.create(f2);
		flatService.create(f3);
		
		LOG.warn("Pisos insertados satisfactoriamente");
		
		// Inserción de personas //
		personService.create(p1);
		personService.create(p2);	
		personService.create(p3);
		personService.create(p4);
		
		LOG.warn("Personas insertadas satisfactoriamente");
		
		// Consultas de seleccion solicitadas por el enunciado //
		
		personService.searchAllEmployees();
		
		personService.searchByNameAndSurname("Juan", "Perez");		
		personService.searchByNameAndSurname("Santiago", "Lopez");
		
				
	}

}
