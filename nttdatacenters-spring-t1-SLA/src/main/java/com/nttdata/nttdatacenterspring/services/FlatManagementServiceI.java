package com.nttdata.nttdatacenterspring.services;

import com.nttdata.nttdatacenterspring.repository.Flat;

/**
 * 
 * FlatManagementServiceI - Servicio de gestión de operaciones con la entidad Piso.
 * 
 * @see Flat
 * 
 * @author Santiago López
 *
 */
public interface FlatManagementServiceI {
	/**
	 * 
	 * create - Inserta un Piso en la BDD
	 * 
	 * @param f - Piso
	 * 
	 */
	public void create(Flat f);
}
