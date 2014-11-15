/**
 * 
 */
package com.blankfrack.test.object;

/**
 * @author Blankfrack
 *
 */
public class Info {
		
	private String firstName;
	
	private String lastName;

	/**
	 * 
	 */
	public Info() {
		
	}
	
	public Info(String pFirstName, String pLastName) {
		this.firstName = pFirstName;
		this.lastName = pLastName;
	}

	public String getInfoId() {
		return this.firstName + " - " + this.lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param pFirstName the firstName to set
	 */
	public void setFirstName(String pFirstName) {
		firstName = pFirstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param pLastName the lastName to set
	 */
	public void setLastName(String pLastName) {
		lastName = pLastName;
	}


}
