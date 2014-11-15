/**
 * 
 */
package com.blankfrack.test.object;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Blankfrack
 *
 */
public class Learner {
	
	private Map<String, Info> infos = new HashMap<String, Info>();

	/**
	 * 
	 */
	public Learner() {
		
	}
	
	public void learn(Info pInfo) {
		this.infos.put(pInfo.getInfoId(), pInfo);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Info info : this.infos.values()) {
			str.append(info.getInfoId() + ": " + info.getFirstName() + " " + info.getLastName() + "\n");
		}
		
		return str.toString();
	}

}
