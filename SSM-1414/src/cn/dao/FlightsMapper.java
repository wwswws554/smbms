package cn.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Flight_tickets;
import cn.pojo.Flights;

public interface FlightsMapper {
	public List<Flights> getAllFlights(Flights flight) throws Exception;
	public List<Flight_tickets> getAllFlight_tickets(int flightId)throws Exception;
}
