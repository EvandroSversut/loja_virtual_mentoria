package jdev.mentoria.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EntityScan(basePackages = "jdev.mentoria.lojavirtual.model")
// se nao tiver criando as tabelas no banco, usar esta anotacao
public class LojaVirtualMentoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualMentoriaApplication.class, args);
	}

}
