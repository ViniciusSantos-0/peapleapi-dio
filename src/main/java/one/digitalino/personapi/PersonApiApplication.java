package one.digitalino.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PersonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
