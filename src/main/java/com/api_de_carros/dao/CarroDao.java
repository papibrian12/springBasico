package com.api_de_carros.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.api_de_carros.dto.Auto;


@Repository
public interface CarroDao extends JpaRepository<Auto, Long>{
	// sql -> structured query language | hql -> hibernate query language

// Auto auto = new Auto();
	// @Query("SELECT auto FROM Auto auto WHERE id = :id")
	@Query(value = "SELECT * FROM Auto WHERE id = :id", nativeQuery = true)
	public Auto obtenerPorId(@PathVariable Long id);
	
	

}
