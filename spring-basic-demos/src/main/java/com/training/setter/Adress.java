package com.training.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //the IOC container will create the object
public class Adress {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	@Value("${employee.adress.city}")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("${employee.adress.city}")
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", state=" + state + "]";
	}

}
