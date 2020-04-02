package com.example.devicemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevicemonitorApplication {


	public static void main(String[] args) {
		SpringApplication.run(DevicemonitorApplication.class, args);
		 System.setProperty("server.lockOutTime","20");
	}
	

}
