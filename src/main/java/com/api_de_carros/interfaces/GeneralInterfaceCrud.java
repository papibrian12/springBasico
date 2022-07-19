package com.api_de_carros.interfaces;

import java.util.List;

public interface GeneralInterfaceCrud<T> {

	public List<T> buscarTodos ();
	public T obtenerPorId(Long id);
	public T EliminarPorId(Long id);
	public T CrearActualizar(T entidad);
	
	
	
}
