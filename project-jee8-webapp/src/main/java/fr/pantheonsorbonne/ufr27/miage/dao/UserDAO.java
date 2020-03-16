package fr.pantheonsorbonne.ufr27.miage.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.jpa.Customer;
import fr.pantheonsorbonne.ufr27.miage.jpa.FlightJPA;
import fr.pantheonsorbonne.ufr27.miage.jpa.UserJPA;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Address;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.ObjectFactory;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.User;

@ManagedBean
public class UserDAO {

	@Inject
	EntityManager em;

	public void addPassenger(String civility, String lastname, String firstname, int volId) {
		UserJPA user = new UserJPA();
		user.setMembershipId(volId);
		user.setFname(firstname);
		user.setLname(lastname);
		user.setCivility(civility);
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}
	
	public List<UserJPA> findUserFromFlight(int volId){
		List<UserJPA> customer = em.createQuery("select a from UserJPA a where membershipId = :membershipId ", UserJPA.class)
                .setParameter("membershipId", volId)
                .getResultList();
		
		return customer;
	}
}
