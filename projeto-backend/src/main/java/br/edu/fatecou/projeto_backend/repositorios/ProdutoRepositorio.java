package br.edu.fatecou.projeto_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecou.projeto_backend.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, String> {
    
}