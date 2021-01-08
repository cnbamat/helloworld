package com.github.palyfight.hellodocker;

import com.github.lalyos.jfiglet.FigletFont;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@SpringBootApplication
public class HellodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodockerApplication.class, args);
		String asciiArt = FigletFont.convertOneLine("Hello k8s");
		System.out.println(asciiArt);
		System.out.println("Yay Me!");
		System.out.println(Instant.now());
	}

}
