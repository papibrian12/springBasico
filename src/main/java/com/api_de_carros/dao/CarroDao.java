package com.api_de_carros.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api_de_carros.dto.Auto;


@Repository
public interface CarroDao extends JpaRepository<Auto, Long>{

}
