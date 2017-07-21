package vchrisb.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TravelUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelUiApplication.class, args);
	}
}
