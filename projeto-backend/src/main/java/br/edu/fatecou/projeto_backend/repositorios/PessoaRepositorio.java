package br.edu.fatecou.projeto_backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecou.projeto_backend.entidades.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, String> {
    
}