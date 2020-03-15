package fr.pantheonsorbonne.ufr27.miage.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.pantheonsorbonne.ufr27.miage.dao.UserDAO;
import fr.pantheonsorbonne.ufr27.miage.ejb.GymService;
import fr.pantheonsorbonne.ufr27.miage.exception.NoSuchUserException;
import fr.pantheonsorbonne.ufr27.miage.exception.UserHasDebtException;
import fr.pantheonsorbonne.ufr27.miage.jms.PaymentValidationAckownledgerBean;
import fr.pantheonsorbonne.ufr27.miage.jms.payment.PaymentProcessorBean;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Address;
import fr.pantheonsorbonne.ufr27.miage.model.jaxb.User;

@Path("/user")
public class UserEndpoint {

	@Inject
	UserDAO dao;

	@POST
	@Path("/{volId}{firstname}{lastname}{civility}")
	public void getUser(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname, @PathParam("volId") int volId, @PathParam("civility") String civility) {
		dao.addPassenger(civility,lastname,firstname,volId);
	}

}
