package br.edu.fatecou.projeto_backend;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecou.projeto_backend.entidades.Pessoa;
import br.edu.fatecou.projeto_backend.entidades.Carro;
import br.edu.fatecou.projeto_backend.entidades.Produto;
import br.edu.fatecou.projeto_backend.repositorios.PessoaRepositorio;
import br.edu.fatecou.projeto_backend.repositorios.CarroRepositorio;
import br.edu.fatecou.projeto_backend.repositorios.ProdutoRepositorio;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjetoBackendApplication implements CommandLineRunner {
	private final ProdutoRepositorio repositorio;
	private final PessoaRepositorio pessoaRepositorio;
	private final CarroRepositorio carroRepositorio;

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

		var pessoa = new Pessoa();
		pessoa.setCodigo(UUID.randomUUID().toString());
		pessoa.setNome("João Silva");
		pessoa.setCpf("123,456,789-00");
		pessoa.setAltura(1.75);
		pessoa.setPeso(80.0);
		pessoaRepositorio.save(pessoa);

		var carro = new Carro();
		carro.setCodigo(UUID.randomUUID().toString());
		carro.setMarca("Volkswagen");
		carro.setModelo("Gol");
		carro.setAnoFabricacao(2015);
		carro.setAnoModelo(2016);
		carro.setValor(35000.0);
		carroRepositorio.save(carro);
	}
}