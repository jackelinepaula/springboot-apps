package com.fatec.sigvs.servico;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Produto;

@Configuration
public class LoadDatabase {
	Logger logger = LogManager.getLogger(this.getClass());
	@Bean
	CommandLineRunner initDatabase(IProdutoRepository repository) {
		return args -> {
			Produto produto1 = new Produto("Eletrobomba 110V para Maquina de Lavar e Lava Louças", "maquina de lavar", 51.66, 12);
			Produto produto2 = new Produto("Eletrobomba 110V", "maquina de lavar", 51.66, 12);
			repository.saveAll(Arrays.asList(produto1, produto2));
			logger.info("LoadDatabase -> Cadastro realizado.");
		};
	}
}
