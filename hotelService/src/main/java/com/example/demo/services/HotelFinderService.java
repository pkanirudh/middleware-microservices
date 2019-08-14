package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hotel;

@Service
public class HotelFinderService {

	@Autowired
	private Hotel hotel;
	
	
	public Hotel findHotelByLocation(String location) {
		
		hotel.setHotelName("Hilton");
		hotel.setId(1000);
		if(location.equalsIgnoreCase("vellore")) {
			
			hotel.setId(1001);
			hotel.setHotelName("Millenium Plaza");
		}
		return hotel;
	}
}
