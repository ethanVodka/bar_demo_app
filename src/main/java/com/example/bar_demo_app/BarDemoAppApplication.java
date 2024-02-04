package com.example.bar_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BarDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarDemoAppApplication.class, args);
	}

}
