package com.flightapp.flightapp.utility;


import java.sql.Time;
import java.util.Comparator;

import com.flightapp.flightapp.dto.FlightServiceResult;

public class DateCompare implements Comparator<FlightServiceResult>{

	@Override
	public int compare(FlightServiceResult o1, FlightServiceResult o2) {
		/*Time t1 = (Time)o1.getDeparture_time();
		Time t2 = (Time)o2.getDeparture_time();*/
		
		return o1.getDeparture_time().compareTo(o2.getDeparture_time());
		
	}

}
