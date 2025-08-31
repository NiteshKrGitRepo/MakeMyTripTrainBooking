package com.ait.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ait.passenger.Passenger;
import com.ait.response.Ticket;

@Service
public class MakeMyTripService {
    
	@Value("${irctc.endpoint.book_ticket}")
	private String book_ticket_url;
	
	@Value("${irctc.endpoint.get_ticket}")
	private String search_ticket_url;

	public Ticket bookRailTicket(Passenger passenger) {

		RestTemplate t = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = t.postForEntity(book_ticket_url, passenger, Ticket.class);
		HttpStatusCode statusCode = responseEntity.getStatusCode();

		if (statusCode == HttpStatus.OK || statusCode == HttpStatus.CREATED) {
			return responseEntity.getBody();

		} else {
			System.out.println("Booking Failed " + statusCode);
		}
		return null;
	}

	public Ticket getTicket(Long ticketId) {
		RestTemplate template = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = template.getForEntity(search_ticket_url,Ticket.class,  ticketId);
		HttpStatusCode statusCode = responseEntity.getStatusCode();
		if (statusCode == HttpStatus.OK) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}else { 
			System.out.println("Ticket Not Found With given Id"+statusCode);
		}
		return null;
	}

}
