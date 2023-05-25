package ogaitw.introducaoaoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class IntroducaoaoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoaoSpringApplication.class, args);
	}

}
