package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;


@Entity
public class SeatJPA {
	
	@Id
	@ManyToOne
	@XmlElement(name = "identifiantVol")
	@XmlInverseReference(mappedBy="nbPlacesRestantes")
	protected FlightJPA flight; 
	
	@XmlElement(name = "price")
	private Double price;
	
	@Id
	@XmlElement(name = "nameClass")
	protected String nameClass; 
	
	@XmlElement(name = "nbSieges")
	protected int nbPassengers;

	/**
	 * @return the flight
	 */
	public FlightJPA getFlight() {
		return flight;
	}

	/**
	 * @param flight the flight to set
	 */
	public void setFlight(FlightJPA flight) {
		this.flight = flight;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the nameClasse
	 */
	public String getNameClass() {
		return nameClass;
	}

	/**
	 * @param nameClasse the nameClasse to set
	 */
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	/**
	 * @return the nbPassengers
	 */
	public int getNbPassengers() {
		return nbPassengers;
	}

	/**
	 * @param nbPassengers the nbPassengers to set
	 */
	public void setNbPassengers(int nbPassengers) {
		this.nbPassengers = nbPassengers;
	}
	
}
