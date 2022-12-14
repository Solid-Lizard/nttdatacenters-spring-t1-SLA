package com.nttdata.nttdatacenterspring.services;

import com.nttdata.nttdatacenterspring.repository.Floor;

/**
 * 
 * FloorManagementServiceI - Servicio de gestión de operaciones con la entidad Planta.
 * 
 * @see Floor
 * 
 * @author Santiago López
 *
 */
public interface FloorManagementServiceI {	
	/**
	 * 
	 * create - Inserta una Planta en la BDD
	 * 
	 * @param f - Planta
	 * 
	 */
	public void create(Floor f);
}
