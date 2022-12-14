package com.nttdata.nttdatacenterspring.repository;

// IMPORTS //
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Floor")
public class Floor {
	// ATRIBUTOS //	
	/**
	 * Mapeo: Atributo identificador "Número de planta" 
	 */
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int floorNumber;
	
	/**
	 * Mapeo: Atributo "Buzon"
	 */
	@Column(name = "Buzon")
	private int buzon;
	
	/**
	 * Atributo: Lista de pisos que contiene la planta
	 * 
	 * @see Flat
	 */
	@OneToMany(mappedBy = "floor")		
	private List<Flat> flat = new ArrayList<>();	
	
	
	// MÉTODOS //
	// Constructor //
	/**
	 * 
	 * Floor - Constructor vacío
	 * 
	 */
	public Floor() {
		// Constructor vacío
	}
	
	// Getters y Setters //	
	/**
	 * 
	 * getFloor - Devuelve el número de la planta
	 * 
	 * @return int - Número de la planta
	 * 
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * 
	 * setFloorNumber - Asigna el número de la planta
	 * 
	 * @param floorNumber - Número de la planta
	 * 
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * 
	 * getBuzon - Devuelve el número del buzón de la planta
	 * 
	 * @return int - Número del puzón
	 * 
	 */
	public int getBuzon() {
		return buzon;
	}

	/**
	 * 
	 * setBuzon - Asigna el número del buzón de la planta
	 * 
	 * @param buzon
	 * 
	 */
	public void setBuzon(int buzon) {
		this.buzon = buzon;
	}

	/**
	 * 
	 * getFlat - Asigna una lista de pisos que pertenecen a la planta
	 * 
	 * @return List - Lista de pisos
	 * 
	 */
	public List<Flat> getFlat() {
		return flat;
	}

	/**
	 * 
	 * setFlat - Asigna una lista de pisos que pertenecen a la planta
	 * 
	 * @see Flat
	 * 
	 * @param flat - Lista de pisos
	 * 
	 */
	public void setFlat(List<Flat> flat) {
		this.flat = flat;
	}
	
	// OTROS MÉTODOS //
	/**
	 * 
	 * addFlat - Añade un piso a la lista de pisos que pertenecen a la planta 
	 * 
	 * @see Flat
	 * 
	 * @param f - Piso
	 * 
	 */
	public void addFlat(Flat f) {
		flat.add(f);
	}

	// toString //
	@Override
	public String toString() {
		return "Floor [floorNumber=" + floorNumber + ", Buzon=" + buzon + ", flat=" + flat + "]";
	}
	
	
	
}
