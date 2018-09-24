package fvs.edu.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.domain.funcionario;

@Repository
public interface FuncionariorRepository extends JpaRepository<funcionario, Integer>{
	
	

}
