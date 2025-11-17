package br.edu.fatecou.projeto_backend;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecou.projeto_backend.entidades.Produto;
import br.edu.fatecou.projeto_backend.repositorios.ProdutoRepositorio;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjetoBackendApplication implements CommandLineRunner {
	private final ProdutoRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBackendApplication.class, args);
	}

	public void run(String... args) throws Exception {
		var produto = new Produto();

		produto.setUuid(UUID.randomUUID().toString());
		produto.setNome("Coca Cola 2 Litros");
		produto.setPreco(12.50);
		produto.setQuantidade(15);

		repositorio.save(produto);

	}
}
