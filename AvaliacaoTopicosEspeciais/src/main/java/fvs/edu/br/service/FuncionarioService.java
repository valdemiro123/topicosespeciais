package fvs.edu.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.funcionario;
import fvs.edu.br.repositories.FuncionariorRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionariorRepository repo;
	
	public funcionario buscar(Integer id) {
		Optional<funcionario> objeto=repo.findById(id);
		
		return objeto.orElse(null);
	}
}
