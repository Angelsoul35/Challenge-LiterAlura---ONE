package com.angelo.literalura;

import com.angelo.literalura.Entities.AutorDTO;
import com.angelo.literalura.Entities.BookDTO;
import com.angelo.literalura.Entities.Models.Author;
import com.angelo.literalura.Entities.ResultsDTO;
import com.angelo.literalura.Implementations.AppMenu;
import com.angelo.literalura.Implementations.LogicService;
import com.angelo.literalura.Mappers.JsonMapper;
import com.angelo.literalura.Services.APIService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@RequiredArgsConstructor
public class LiteraluraApplication implements CommandLineRunner {

	private final AppMenu appMenu;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		appMenu.runApp();
	}
}