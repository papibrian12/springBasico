package com.api_de_carros.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api_de_carros.dto.Auto;
import com.api_de_carros.services.AutoService;

@RestController
@RequestMapping(path = "/api/autos")
public class AutoController {
	
	@Autowired
	AutoService autoService;

	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/listarTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Auto>> buscarTodos(){
		return ResponseEntity.ok(autoService.buscarTodos());
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/Crear", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Auto> Crear(@RequestBody Auto auto){
		return ResponseEntity.ok(autoService.CrearActualizar(auto));
	}

}
