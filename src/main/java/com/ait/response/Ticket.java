package com.ait.response;

import lombok.Data;

@Data
public class Ticket {
	private Long ticketId;
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String doj;
	private Double ticketPrice;
	private Long trainNo;
	private String status;
}
