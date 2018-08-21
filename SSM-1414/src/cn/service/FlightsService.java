package cn.service;

import java.util.List;

import cn.pojo.Flight_tickets;
import cn.pojo.Flights;

public interface FlightsService {
	public List<Flights> allFlights(Flights flight) throws Exception;
	public List<Flight_tickets> allFlight_tickets(int flightId)throws Exception;
}
