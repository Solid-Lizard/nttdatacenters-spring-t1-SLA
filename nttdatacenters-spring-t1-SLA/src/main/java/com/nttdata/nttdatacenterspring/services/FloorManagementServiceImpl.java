package com.nttdata.nttdatacenterspring.services;

// IMPORTS //
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.nttdatacenterspring.repository.Floor;
import com.nttdata.nttdatacenterspring.repository.FloorDAOI;



/**
 * 
 * FloorManagementServiceImpl - Servicio implmentación de "FloorManagementServiceI"
 * 
 * @see FloorManagementServiceI
 * 
 * @author Santiago López
 *
 */
@Service
public class FloorManagementServiceImpl implements FloorManagementServiceI {
	// ATRIBUTOS //
	/**
	 * Repositorio: Gestión de plantas
	 * 
	 * @see FloorDAOI
	 */
	@Autowired
	private FloorDAOI floorDao;
	
	
	// MÉTODOS //
	/**
	 * 
	 * FloorManagementServiceImpl - Constructor vacío
	 * 
	 */
	public FloorManagementServiceImpl() {
		// Constructor vacío
	}
	
	@Override
	public void create(Floor f) {
		floorDao.save(f);
		
	}

}
