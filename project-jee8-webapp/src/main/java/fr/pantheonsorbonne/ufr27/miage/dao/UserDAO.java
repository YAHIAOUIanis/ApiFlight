package fr.pantheonsorbonne.ufr27.miage.dao;

import javax.annotation.ManagedBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.jpa.Customer;
import fr.pantheonsorbonne.ufr27.miage.jpa.User;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Address;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.ObjectFactory;

@ManagedBean
public class UserDAO {

	@Inject
	EntityManager em;

	public void addPassenger(String civility, String lastname, String firstname, int volId) {
		User user = new User();
		user.setMembershipId(volId);
		user.setFname(firstname);
		user.setLname(lastname);
		user.setCivility(civility);
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}
}
