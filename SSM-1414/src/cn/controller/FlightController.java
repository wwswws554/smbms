package cn.controller;

import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.pojo.Airports;
import cn.pojo.Flight_tickets;
import cn.pojo.Flights;
import cn.service.FlightsService;

@Controller
public class FlightController {
	private Logger logger = Logger.getLogger(FlightController.class);
	
	@Resource
	private FlightsService flightsService;
	
	@RequestMapping(value="/flight")
	public String allFlights(Model model,String flightDate,String takeoff,String landing){
		List<Flights> flightsList=null;
		try {
			flightsList = flightsService.allFlights(new Flights(flightDate,new Airports(takeoff),new Airports(landing)));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		model.addAttribute("flightsList", flightsList);
		return "index";
	}
	@RequestMapping(value="/allFlight_tickets.json",method=RequestMethod.GET)
	@ResponseBody
	public List<Flight_tickets> allFlight_tickets (@RequestParam int id){
		List<Flight_tickets> lists=null;
		try{
			lists=	flightsService.allFlight_tickets(id);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lists;
				
	}	
}
