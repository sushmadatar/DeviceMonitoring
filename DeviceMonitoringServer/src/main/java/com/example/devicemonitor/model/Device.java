package com.example.devicemonitor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Device {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;

	@Column(name = "name")
	private String name;

	@Column(name = "\"os version\"")
	private String osVersion;

	@Column(name = "\"sdk version\"")
	private String sdkVersion;

	@Column(name = "device")
	private String device;

	@Column(name = "model")
	private String model;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getosVersion() {
		return osVersion;
	}

	public void setosVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public void setsdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	public String getsdkVersion() {
		return sdkVersion;
	}

	public void setdevice(String device) {
		this.device = device;
	}

	public String getdevice() {
		return device;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public String getmodel() {
		return model;
	}
}
