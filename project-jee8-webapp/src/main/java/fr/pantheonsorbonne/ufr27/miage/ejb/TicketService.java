package fr.pantheonsorbonne.ufr27.miage.ejb;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import fr.pantheonsorbonne.ufr27.miage.model.jaxb.Seat;
import fr.pantheonsorbonne.ufr27.miage.vo.ANFlightDTO;

public interface TicketService {

	float getPrice(char nameClass, int nbreserv);

}