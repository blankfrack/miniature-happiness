/**
 * 
 */
package com.blankfrack.test;

import com.blankfrack.test.object.Info;
import com.blankfrack.test.object.Learner;

/**
 * This is a simple test
 * @author Blankfrack
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World !");
				
		Learner learner = new Learner();		
		learner.learn(new Info("Bill", "Smith"));
		learner.learn(new Info("Bob", "Williams"));
		learner.learn(new Info("Ted", "Brown"));
		learner.learn(new Info("John", "White"));
		learner.learn(new Info("Bill", "Murphy"));
	
		System.out.println(learner.toString());
	}
}
