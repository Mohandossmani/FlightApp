package com.flightapp.flightapp.utility;

import java.util.Comparator;

import com.flightapp.flightapp.dto.FlightServiceResult;

public class DurationCompare implements Comparator<FlightServiceResult>{

	@Override
	public int compare(FlightServiceResult o1, FlightServiceResult o2) {
		Double i1 = (Double)o1.getDuration();
		Double i2 = (Double)o2.getDuration();
		
		if(i1<i2) {
			return +1;
		} else if(i1>i2) {
			return -1;
		} else {
			return 0;
		}
	}

}
