package com.nttdata.nttdatacenterspring.services;

// IMPORTS //
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.nttdatacenterspring.repository.Flat;
import com.nttdata.nttdatacenterspring.repository.FlatDAOI;


/**
 * 
 * FlatManagementServiceImpl - Servicio implementación de la interfaz "FlatManagementServiceI"
 * 
 * @see FlatManagementServiceI
 * 
 * @author Santiago López
 *
 */
@Service
public class FlatManagementServiceImpl implements FlatManagementServiceI {
	// ATRIBUTOS //
	/**
	 * Repositorio: Gestión de pisos
	 * 
	 * @see FlatDAOI
	 */
	@Autowired
	FlatDAOI flatDao;
	
	// MÉTODOS //
	/**
	 * 
	 * FlatManagementServiceImpl - Constructor vacío
	 * 
	 */
	public FlatManagementServiceImpl() {
		// Constructor vacío
	}
	
	@Override
	public void create(Flat f) {
		flatDao.save(f);
		
	}


}
