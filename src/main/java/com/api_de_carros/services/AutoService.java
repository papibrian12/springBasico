package com.api_de_carros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_de_carros.dao.CarroDao;
import com.api_de_carros.dto.Auto;
import com.api_de_carros.interfaces.GeneralInterfaceCrud;

@Service
public class AutoService implements GeneralInterfaceCrud<Auto>{
	
	@Autowired
	CarroDao carroDao;

	@Override
	public List<Auto> buscarTodos() {
		return carroDao.findAll();
	}

	@Override
	public Auto obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auto EliminarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auto CrearActualizar(Auto entidad) {
		return carroDao.save(entidad);
		
	}


	
	
}
