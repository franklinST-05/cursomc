package com.course.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.domain.Categoria;
import com.course.repositories.CategoriaRepository;
import com.course.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	// public Categoria find(Integer id) {
	// Optional<Categoria> cat = repo.findById(id);
	// return cat.orElse(null);
	// }
	// erros a serem estudados
	// 400, 401, 403, 500, 502, 503

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado ID: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
