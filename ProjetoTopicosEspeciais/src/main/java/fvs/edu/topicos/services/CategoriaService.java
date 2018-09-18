package fvs.edu.topicos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.topicos.domain.Categoria;
import fvs.edu.topicos.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    
	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repositorio.findById(id);
	
		return obj.orElse(null);
	}
	
}
