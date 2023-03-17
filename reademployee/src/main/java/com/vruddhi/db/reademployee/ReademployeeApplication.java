
package com.vruddhi.db.reademployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vruddhi.db.*"})
@EntityScan(basePackages = {"com.vruddhi.db.*"})
@EnableJpaRepositories(basePackages = {"com.vruddhi.db.*"})
public class ReademployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReademployeeApplication.class, args);
	}

}
