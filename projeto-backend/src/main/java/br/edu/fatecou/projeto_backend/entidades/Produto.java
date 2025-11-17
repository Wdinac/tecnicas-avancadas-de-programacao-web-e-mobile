package br.edu.fatecou.projeto_backend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {
    @Id
    private String uuid;

    private String nome;
    private Integer quantidade;
    private Double preco;
}
