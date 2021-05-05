package br.com.maria.cadpessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maria.cadpessoas.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}

