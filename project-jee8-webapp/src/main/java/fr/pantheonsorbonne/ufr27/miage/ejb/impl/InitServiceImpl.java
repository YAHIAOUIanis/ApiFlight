/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pantheonsorbonne.ufr27.miage.ejb.impl;

import java.util.Date;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import fr.pantheonsorbonne.ufr27.miage.dao.FlightDAO;
import fr.pantheonsorbonne.ufr27.miage.dao.InvoiceDAO;
import fr.pantheonsorbonne.ufr27.miage.ejb.GymService;
import fr.pantheonsorbonne.ufr27.miage.ejb.InitService;
import fr.pantheonsorbonne.ufr27.miage.ejb.InvoicingService;
import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.exception.UserHasDebtException;
import fr.pantheonsorbonne.ufr27.miage.jpa.Card;
import fr.pantheonsorbonne.ufr27.miage.jpa.Contract;
import fr.pantheonsorbonne.ufr27.miage.jpa.Customer;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Flight;

@ManagedBean
public class InitServiceImpl implements InitService {

	@Inject
	FlightDAO dao;
	
	public void init() {
		this.initFlights();
	}
	
	public void initFlights() {
		//FIRST FLIGHT
		Flight flight = new Flight();
		//flight.setDateDepart(null);
		flight.setNbPlacesRestantes(12);
	//	flight.setIdentifiantCompanie('AF');
		//flight.setIdentifiantVol('623');
		//flight.setDestination('Paris');
		//flight.setOrigine('Test');
		//flight.setHeureArrivee('22');
		//flight.setHeureDepart(23);
	//	flight.setDateArrivee(null);
	//	flight.setDureeVol(1);
		dao.addFlight(flight);
		
		//SECOND FLIGHT
		
		//THIRD FLIGHT
		
		//FOURTH FLIGHT
	}

}
