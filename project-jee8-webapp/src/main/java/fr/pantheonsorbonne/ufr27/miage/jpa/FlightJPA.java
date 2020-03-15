package fr.pantheonsorbonne.ufr27.miage.jpa;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class FlightJPA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement(name = "id")
	private int id;
	
	@XmlElement(name = "identifiantCompanie")
    protected String identifiantCompanie;

	@XmlElement(name = "identifiantVol")
    protected String identifiantVol;

	@XmlElement(name = "Seats")
	@XmlTransient
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "flight")
    protected List<SeatJPA> nbPlacesRestantes;

	@XmlElement(name = "origine")
    protected String origine;

	@XmlElement(name = "destination")
    protected String destination;

    protected Date heureDepart;
    
    protected Date heureArrivee;
    
	@XmlElement(name = "dureeVol")
    protected String dureeVol;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the identifiantCompanie
	 */
	public String getIdentifiantCompanie() {
		return identifiantCompanie;
	}

	/**
	 * @param identifiantCompanie the identifiantCompanie to set
	 */
	public void setIdentifiantCompanie(String identifiantCompanie) {
		this.identifiantCompanie = identifiantCompanie;
	}

	/**
	 * @return the identifiantVol
	 */
	public String getIdentifiantVol() {
		return identifiantVol;
	}

	/**
	 * @param identifiantVol the identifiantVol to set
	 */
	public void setIdentifiantVol(String identifiantVol) {
		this.identifiantVol = identifiantVol;
	}

	/**
	 * @return the nbPlacesRestantes
	 */
	public List<SeatJPA> getNbPlacesRestantes() {
		return nbPlacesRestantes;
	}

	/**
	 * @param nbPlacesRestantes the nbPlacesRestantes to set
	 */
	public void setNbPlacesRestantes(List<SeatJPA> nbPlacesRestantes) {
		this.nbPlacesRestantes = nbPlacesRestantes;
	}

	/**
	 * @return the origine
	 */
	public String getOrigine() {
		return origine;
	}

	/**
	 * @param origine the origine to set
	 */
	public void setOrigine(String origine) {
		this.origine = origine;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the heureDepart
	 */
	public Date getHeureDepart() {
		return heureDepart;
	}

	/**
	 * @param heureDepart the heureDepart to set
	 */
	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	/**
	 * @return the heureArrivee
	 */
	public Date getHeureArrivee() {
		return heureArrivee;
	}

	/**
	 * @param heureArrivee the heureArrivee to set
	 */
	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	/**
	 * @return the dureeVol
	 */
	public String getDureeVol() {
		return dureeVol;
	}

	/**
	 * @param dureeVol the dureeVol to set
	 */
	public void setDureeVol(String dureeVol) {
		this.dureeVol = dureeVol;
	}
    
}
