package com.example.devicemonitor.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.devicemonitor.model.Device;

public interface DeviceRepository extends CrudRepository<Device, Integer> {

	
}
