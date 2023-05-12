package com.erp.erpspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.erp.erpspring.model.Category;
import com.erp.erpspring.repository.CategoryRepository;

@SpringBootApplication
public class ErpSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpSpringApplication.class, args);
	}

	//Este metodo eh apenas para inserir registros de categoria para teste!!! Remover apos
	@Bean
	CommandLineRunner initDatabase(CategoryRepository categoryRepository) {
		return args -> {
			categoryRepository.deleteAll();

			Category category = new Category();
			category.setName("teste");
			categoryRepository.save(category);
		};
	}

}
