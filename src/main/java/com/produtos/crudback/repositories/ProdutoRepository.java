package com.produtos.crudback.repositories;

import com.produtos.crudback.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}