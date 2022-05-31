package com.letscode.santander.harrypotter.cadastroalunos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CadastroAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroAlunosApplication.class, args);
		System.out.println("\nCadastro de Alunos Mágicos rodando!!!\n\n");
	}

}
