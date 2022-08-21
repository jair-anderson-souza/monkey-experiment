package io.github.jass2125.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MonkeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonkeyApplication.class, args);
	}

}