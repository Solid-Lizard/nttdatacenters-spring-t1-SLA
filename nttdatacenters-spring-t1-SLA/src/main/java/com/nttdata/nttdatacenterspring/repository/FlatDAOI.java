package com.nttdata.nttdatacenterspring.repository;

// IMPORTS //
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 
 * FlatDAOI - Repositorio DAO que gestiona los pisos. Extiende de JpaRepository
 * 
 * @see Flat
 * 
 * @author Santiago López
 *
 */
@Repository
public interface FlatDAOI extends JpaRepository<Flat, Integer>{

}
