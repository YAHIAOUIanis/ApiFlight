package fr.pantheonsorbonne.ufr27.miage.ejb;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Flight;


public interface FlightService {

	int countPassengers(int volId);
	
}