package dio.Springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import dio.Springboot.app.ConversorJson;
import dio.Springboot.app.ViaCepResponse;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}