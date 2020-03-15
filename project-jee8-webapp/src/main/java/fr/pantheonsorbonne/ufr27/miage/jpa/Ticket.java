package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;


public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement(name = "id")
	private int id;

	@XmlElement(name = "identifiantVol")
	protected String lastNamePassenger; 
	
	@XmlElement(name = "price")
	private String firstNamePassenger;
	
	@Id
	@XmlElement(name = "price")
	protected Double price; 
		
}
