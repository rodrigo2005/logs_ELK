package br.com.ceres.elk.ceres;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/log")
public class CeresApplication {

	Logger log = LoggerFactory.getLogger(CeresApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CeresApplication.class, args);
	}

	@GetMapping
	public String gerar(){
	log.info("Log realizado pelo geremias");
		return "gerado";
	}


}
