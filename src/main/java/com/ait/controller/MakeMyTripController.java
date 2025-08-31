package com.ait.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ait.passenger.Passenger;
import com.ait.response.Ticket;
import com.ait.service.MakeMyTripService;

@Controller
public class MakeMyTripController {

	@Autowired
	private MakeMyTripService service;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("/bookticket")
	public String bookTicket(Passenger passenger, Model model) {
		Ticket ticket = service.bookRailTicket(passenger);
		model.addAttribute("tickets", ticket);
		return "success";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/searchTicket")
	public String getTicketById(@RequestParam Long ticketId,Model model ) {
		Ticket ticketinfo = service.getTicket(ticketId);
		model.addAttribute("tickets", ticketinfo);
		return "ticketin";

        System.out.println("Hi")

	}
}
