package fr.pantheonsorbonne.ufr27.miage.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserJPA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    String fname;
    String lname;
    Integer membershipId;
    String civility;
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
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the membershipId
	 */
	public Integer getMembershipId() {
		return membershipId;
	}
	/**
	 * @param membershipId the membershipId to set
	 */
	public void setMembershipId(Integer membershipId) {
		this.membershipId = membershipId;
	}
	/**
	 * @return the civility
	 */
	public String getCivility() {
		return civility;
	}
	/**
	 * @param civility the civility to set
	 */
	public void setCivility(String civility) {
		this.civility = civility;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", membershipId=" + membershipId + ", civility=" + civility
				+ "]";
	}
    
}
