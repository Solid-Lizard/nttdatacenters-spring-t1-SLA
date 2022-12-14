package com.nttdata.nttdatacenterspring.repository;

// IMPORTS //
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * Person - Mapeo de la entidad "Persona"
 * 
 * @author Santiago López
 *
 */
@Entity
@Table(name="Person")
public class Person {
	// ATRIBUTOS //
	/**
	 * Mapeo: Atributo identificador de la persona
	 */
	@Id		
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	
	/**
	 * Mapeo: Nombre de la persona
	 */
	@Column(name = "Name")
	private String name;
	
	/**
	 * Mapeo: Apellido de la persona
	 */
	@Column(name = "Surname")
	private String surname;
	
	/**
	 * Mapeo: Dni de la persona
	 */
	@Column(name = "Dni")
	private String dni;
	
	/**
	 * Mapeo: Número de piso al que pertenece la persona
	 * 
	 * @see Flat
	 */
	@ManyToOne
	@JoinColumn(name = "Flat-Number")
	private Flat flat;

	
	// MÉTODOS //
	// Constructor //
	/**
	 * 
	 * Person - Constructor vacío
	 * 
	 */
	public Person() {
		// Constructor vacío
	}
	
	// Getters y Setters //
	/**
	 * 
	 * setId - Asigna un número identificador a la persona
	 * 
	 * @return int - Identificador
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * getId - Devuelve el número identificador de la persona
	 * 
	 * @param id - Identificador
	 * 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * getName - Devuelve el nombre de la persona
	 * 
	 * @return String - Nombre
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * setName - Asigna el nombre de la persona
	 * 
	 * @param name - Nombre
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * getSurname - Devuelve el apellido de la persona
	 * 
	 * @return String - Apellido
	 * 
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * 
	 * setSurname - Asigna el apellido de la persona
	 * 
	 * @param surname - Apellido
	 * 
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * 
	 * getDni - Devuelve el dni de la persona
	 * 
	 * @return String - Dni
	 * 
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 * setDni - Asigna el dni de la persona
	 * 
	 * @param dni - Dni
	 * 
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * 
	 * getFlat - Devuelve el piso al que pertenece la persona
	 * 
	 * @see Flat
	 * 
	 * @return Flat - Piso
	 * 
	 */
	public Flat getFlat() {
		return flat;
	}

	/**
	 * 
	 * setFlat - Asigna el piso al que pertenece la persona
	 * 
	 * @see Flat
	 * 
	 * @param flat - Piso
	 * 
	 */
	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	// OTROS MÉTODOS //	
	// toString //
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
}
