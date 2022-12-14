package com.nttdata.nttdatacenterspring.repository;

// IMPORTS //
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 * Flat - Mapeo de la entidad "Flat"
 * 
 * @author Santiago Lopez
 *
 */
@Entity
@Table(name="Flat")
public class Flat {
	// ATRIBUTOS //
	/**
	 * Mapeo de atributo identificador: Número de piso
	 * 
	 * Valor generado automáticamente
	 */
	@Id		
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int flatNumber;
	
	/**
	 * Mapeo de atributo llave foránea: Número de planta a la que pertenece
	 * 
	 * @see Floor
	 */
	@ManyToOne
	@JoinColumn(name = "Floor-Number")	
	private Floor floor;
	
	/**
	 * Atributo: Lista de personas que pertenecen al piso
	 * 
	 * @see Person
	 */
	@OneToMany(mappedBy ="flat")
	private List<Person> habitants = new ArrayList<>();

	
	// MÉTODOS //	
	// Constructor //
	/**
	 * 
	 * Flat - Constructor vacío
	 * 
	 */
	public Flat() {
		// Constructor vacío
	}
	
	// Getters y Setters //
	/**
	 * 
	 * getFlatNumber - Devuelve el número del piso
	 * 
	 * @return int - Número del piso
	 * 
	 */
	public int getFlatNumber() {
		return flatNumber;
	}

	/**
	 * 
	 * setFlat - Asigna el número del piso
	 * 
	 * @param flatNumber - Número del piso
	 * 
	 */
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * 
	 * getFloor - Devuelve la planta a la que pertenece el piso
	 * 
	 * @see Floor
	 * 
	 * @return Floor - Planta
	 * 
	 */
	public Floor getFloor() {
		return floor;
	}

	/**
	 * 
	 * setFloor - Asigna la planta a la que pertenece el piso
	 * 
	 * @see Floor
	 * 
	 * @param floor - Planta
	 * 
	 */
	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	/**
	 * 
	 * getHabitants - Devuelve una lista de personas que viven en el piso
	 * 
	 * @see Person
	 * 
	 * @return List - Lista de personas
	 * 
	 */
	public List<Person> getHabitants() {
		return habitants;
	}

	/**
	 * 
	 * setHabitants - Asigna una lista de personas que viven en el piso
	 * 
	 * @see Person
	 * 
	 * @param habitants - Lista de personas
	 * 
	 */
	public void setHabitants(List<Person> habitants) {
		this.habitants = habitants;
	}
	
	// OTROS MÉTODOS //
	/**
	 * 
	 * addHabitant - Añade un habitante a la lista de personas que viven en el piso
	 * 
	 * @param p - Persona a añadir
	 * 
	 */
	public void addHabitant(Person p) {
		habitants.add(p);
	}
	
	
}
