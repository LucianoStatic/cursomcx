package com.lucianosilva.cursomcx.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucianosilva.cursomcx.domain.Categoria;
import com.lucianosilva.cursomcx.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoria_serv;
	
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable  Integer id) {
		
	Categoria objeto_Cat = categoria_serv.buscar(id);
		
		return ResponseEntity.ok().body(objeto_Cat);
	}
	
	
	
	
	
	
	
}
