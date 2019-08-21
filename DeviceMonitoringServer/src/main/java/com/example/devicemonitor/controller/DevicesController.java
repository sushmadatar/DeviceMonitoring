package com.example.devicemonitor.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DevicesController {

	@RequestMapping("/getDevices")
	String home() {
		return "Hello World!";
	}
}
