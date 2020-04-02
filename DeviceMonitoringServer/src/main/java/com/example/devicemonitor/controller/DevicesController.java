package com.example.devicemonitor.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.devicemonitor.model.Device;
import com.example.devicemonitor.repository.DeviceRepository;
import com.weddini.throttling.Throttling;
import com.weddini.throttling.ThrottlingType;

@RestController
@EnableAutoConfiguration
public class DevicesController {

	@Autowired
	private DeviceRepository deviceRepository;

	@Throttling(type = ThrottlingType.RemoteAddr, limit = 1, timeUnit = TimeUnit.SECONDS)
	@RequestMapping("/getDevices")
	Iterable<Device> home() {
		return ((CrudRepository<Device, Integer>) deviceRepository).findAll();
	}

	@PostMapping(path = "/addDevice")
	public @ResponseBody String addNewDevice(@RequestBody Device device) {
		deviceRepository.save(device);
		return "done";
	}
}
