package com.flightapp.flightapp.utility;

import java.util.Comparator;

import com.flightapp.flightapp.dto.FlightServiceResult;

public class AirLineNameCompare implements Comparator<FlightServiceResult>{

	@Override
	public int compare(FlightServiceResult o1, FlightServiceResult o2) {
		
		return o2.getAirline_name().compareTo(o1.getAirline_name());
	}

}
