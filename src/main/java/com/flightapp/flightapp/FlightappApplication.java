package com.flightapp.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.flightapp.flightapp.controller","com.flightapp.flightappdaoimpl","com.flightapp.flightapp.serviceimpl"})
@SpringBootApplication
public class FlightappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightappApplication.class, args);
	}

}
