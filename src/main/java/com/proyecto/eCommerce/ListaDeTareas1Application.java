package com.proyecto.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ListaDeTareas1Application {

	public static void main(String[] args) {
		SpringApplication.run(ListaDeTareas1Application.class, args);
	}

}
