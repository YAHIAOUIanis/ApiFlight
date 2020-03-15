package fr.pantheonsorbonne.ufr27.miage.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.pantheonsorbonne.ufr27.miage.dao.FlightDAO;
import fr.pantheonsorbonne.ufr27.miage.ejb.GymService;
import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.exception.UserHasDebtException;
import fr.pantheonsorbonne.ufr27.miage.jms.PaymentValidationAckownledgerBean;
import fr.pantheonsorbonne.ufr27.miage.jms.payment.PaymentProcessorBean;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Address;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Flight;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.User;

import java.sql.Date;
import java.util.List;

@Path("/flight")
public class FlightEndpoint {
	
	@Inject
	FlightDAO dao;

	@GET
	@Path("/{dateDepart}{iata}{heureDepart}")
	public  List<Flight> getFlights(@PathParam("dateDepart") Date dateDepart, @PathParam("IATA") String iata, @PathParam("heureDepart") Date heureDepart) {
		try {
			return dao.getFlights(dateDepart,  iata, heureDepart);
		} catch (NoSuchUserException e) {
			throw new WebApplicationException(404);
		}
	}

}
