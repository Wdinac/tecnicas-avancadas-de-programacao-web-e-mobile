package br.edu.fatecou.projeto_backend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pessoa {
    @Id
    private String codigo;

    private String nome;
    private String cpf;
    private Double altura;
    private Double peso;
}