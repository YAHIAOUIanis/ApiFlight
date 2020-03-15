package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;


public class TicketJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement(name = "id")
	private int id;

	@XmlElement(name = "passenger")
	protected UserJPA passenger; 
	
	@XmlElement(name = "flight")
	private FlightJPA flight;
	
	@XmlElement(name = "seat")
	private SeatJPA seat;

	
	@XmlElement(name = "price")
	protected Double price; 
		
}
