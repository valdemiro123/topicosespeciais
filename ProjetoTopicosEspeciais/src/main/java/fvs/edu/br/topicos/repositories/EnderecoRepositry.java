package fvs.edu.br.topicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.topicos.domain.Endereco;

@Repository
public interface EnderecoRepositry extends JpaRepository<Endereco, Integer> {

}
