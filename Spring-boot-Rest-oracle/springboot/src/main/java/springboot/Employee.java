package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.topics")
@ComponentScan(basePackages = "com.topics")
@EntityScan(basePackages = "com.topics")
public class Employee {

	public static void main(String[] args) {
		SpringApplication.run(Employee.class, args);

	}

}
