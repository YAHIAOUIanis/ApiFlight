package fr.pantheonsorbonne.ufr27.miage.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import fr.pantheonsorbonne.ufr27.miage.ejb.InitService;
import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.jpa.Customer;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Address;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.ObjectFactory;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.User;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Flight;

@ManagedBean
public class FlightDAO {

	@Inject
	EntityManager em;


	public List<Flight> getFlights(Date dateDepart, String  iata, Date heureDepart) throws NoSuchUserException {

		List<Flight> customer = em.createQuery("select a from Flight a "
                + "where dateDepart = :dateDepart "
                + "and iata = :iata "
                + "and heureDepart = :heureDepart", Flight.class)
                .setParameter("dateDepart", dateDepart)
                .setParameter("iata", iata)
                .setParameter("heureDepart", heureDepart)
                .getResultList();
		if(customer==null) {
			throw new NoSuchUserException();
		}
		
		return customer;

	}
	
	public void addFlight(Flight flight) {
			em.getTransaction().begin();
			em.persist(flight);
			em.getTransaction().commit();
	}
	
}
