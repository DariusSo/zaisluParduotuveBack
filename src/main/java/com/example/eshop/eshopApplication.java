package com.example.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class eshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(eshopApplication.class, args);
	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**")
							.allowedOrigins("http://127.0.0.1:8080","http://127.0.0.1:7777", "http://localhost:7777", "http://172.17.0.1:7777", "*") // Adjust this to your frontend origin
							.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
							.allowedHeaders("*")
							.allowCredentials(true);
				}
			};
		}
	}

}
