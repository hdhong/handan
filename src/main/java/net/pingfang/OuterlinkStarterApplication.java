package net.pingfang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OuterlinkStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OuterlinkStarterApplication.class, args);
	}
}
