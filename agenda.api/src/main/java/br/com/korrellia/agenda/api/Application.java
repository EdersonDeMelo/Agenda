package br.com.korrellia.agenda.api;

import br.com.korrellia.agenda.api.model.entity.Contato;
import br.com.korrellia.agenda.api.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public CommandLineRunner commandLineRunner(@Autowired ContatoRepository repository){
		return args -> {
			Contato contato=new Contato();
			contato.setNome("Maguila");
			contato.setEmail("ederson@email");
			contato.setFavorito(false);
			repository.save(contato);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
