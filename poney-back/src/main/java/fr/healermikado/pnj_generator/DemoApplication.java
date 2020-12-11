package fr.healermikado.pnj_generator;

import java.util.HashMap;
import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.healermikado.pnj_generator.daos.ICharacterDao;
import fr.healermikado.pnj_generator.dtos.CharacterDto;
import fr.healermikado.pnj_generator.entity.CharacterEntity;
import fr.healermikado.pnj_generator.entity.Level;
import fr.healermikado.pnj_generator.services.CharacterService;

@SpringBootApplication
public class DemoApplication {
	Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	@Autowired
	CharacterService characterService;

	@Autowired
	ICharacterDao iCharacterDao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

}
