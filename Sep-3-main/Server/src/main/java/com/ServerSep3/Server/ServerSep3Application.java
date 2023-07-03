package com.ServerSep3.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories
public class ServerSep3Application {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(ServerSep3Application.class, args);
	}

}
