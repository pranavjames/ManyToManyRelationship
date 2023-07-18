package com.manytomany.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackageClasses = {POC.class,Tag.class})
@EnableJpaRepositories(basePackageClasses = {POCRepository.class,TagRepository.class})
@SpringBootApplication(scanBasePackages = "com.manytomany")
public class ManyTOmanyTry1Application {

	public static void main(String[] args) {
		SpringApplication.run(ManyTOmanyTry1Application.class, args);
	}

}
