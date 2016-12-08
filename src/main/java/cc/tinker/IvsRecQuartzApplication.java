package cc.tinker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class IvsRecQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(IvsRecQuartzApplication.class, args);
	}
}
