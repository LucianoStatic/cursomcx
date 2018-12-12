package com.lucianosilva.cursomcx.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucianosilva.cursomcx.domain.Categoria;
import com.lucianosilva.cursomcx.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoria_reposicao;
	
	
	
	
	public Categoria buscar(Integer id) {
		
		
		Optional<Categoria> objeto_cat = categoria_reposicao.findById(id);
		
		
		return objeto_cat.orElse(null);
		
		
	}
	
	
	
	
}
