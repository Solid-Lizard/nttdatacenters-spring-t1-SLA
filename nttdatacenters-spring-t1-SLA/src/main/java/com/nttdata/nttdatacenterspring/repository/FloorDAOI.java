package com.nttdata.nttdatacenterspring.repository;

// IMPORTS //
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * FloorDAOI - Repositorio DAO que gestiona las plantas. Extiende de JpaRepository
 * 
 * @see Floor
 * 
 * @author Santiago López
 *
 */
@Repository
public interface FloorDAOI extends JpaRepository<Floor, Integer>{

}
