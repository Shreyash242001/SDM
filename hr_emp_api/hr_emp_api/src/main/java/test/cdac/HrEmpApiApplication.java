package test.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "hr_api")
@EnableJpaRepositories(basePackages = "hr_api")
@EntityScan(basePackages = "hr_api")
public class HrEmpApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrEmpApiApplication.class, args);
	}

}
