package com.example.devicemonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.devicemonitor.model.Device;
import com.example.devicemonitor.repository.DeviceRepository;

@RestController
@EnableAutoConfiguration
public class DevicesController {

	@Autowired
	private DeviceRepository deviceRepository;

	@RequestMapping("/getDevices")
	Iterable<Device> home() {
		return ((CrudRepository<Device, Integer>) deviceRepository).findAll();
	}

	@PostMapping(path = "/addDevice")
	public @ResponseBody String addNewDevice() {
		return "";
	}
}
