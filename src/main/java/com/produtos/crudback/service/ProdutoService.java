package com.produtos.crudback.service;


import com.produtos.crudback.model.Produto;
import com.produtos.crudback.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    //get
    public List<Produto> ListAll() {
        return repository.findAll();
    }
    // get por id
    public Optional<Produto> findById(Long id){
        return repository.findById(id);
    }

    //post
    public Produto createProduto(Produto produto){
        return repository.save(produto);

    }
    // atualiza por id
    public Produto updateProduto(Long id, Produto produtoUpdate){
        return repository.findById(id).map(produto -> {
            produto.setNome(produtoUpdate.getNome());
            produto.setDescricao(produtoUpdate.getDescricao());
            produto.setPreco(produtoUpdate.getPreco());
            return repository.save(produto);
        }).orElseThrow(() -> new RuntimeException("Produto nao encontrado."));
    }

    //delete por id
    public void deleteProduto(Long id){

    }

}
