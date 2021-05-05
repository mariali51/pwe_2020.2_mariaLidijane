package br.com.maria.agropopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maria.agropopshopmodels.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, log> {

}
