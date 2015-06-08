package com.musicSearch.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *  Main entrance for Spring Boot App
 * @author ruibi
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@Import(RepositoryRestMvcConfiguration.class)
public class MusicSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicSearchApplication.class, args);
	}

	
	@RequestMapping(value = "/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	String status() {
		return "{\"state\": \"running\"}";
	}
}
