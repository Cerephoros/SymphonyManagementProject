/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

/* **************************************************************
 
 * CST 8288  Project 1 
 * 
 * Author: Wei Cui
 * Student #: 040875956
 * Phone class
 *
 *  
 * **************************************************************/

/**
 *
 * @author Sony
 */
public class Phone implements ValidClass {
	
	private String phoneNumber; 
	private boolean validPhoneNumber=false; // Checks if the number is valid
	
	/** This class makes a phone and checks to see if it is valid
	 * the validPhoneNumber checks it is 
	 *************************************************************/
	public Phone(){//null constructor
		//will have a valid phone number, can be parsed to check if valid
		this.phoneNumber ="6131234567" ; 
	}
	
	public Phone(String conInputNumber	){
		
		
		this.phoneNumber = conInputNumber.replaceAll("[\\s\\-() ]", "");
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the phoneNumber whether true or false
	 * @return phoneNumber 
	 *************************************************************/
	public String getPhoneNumber() {
		return (phoneNumber.substring(0, 3)+" "+phoneNumber.substring(3, 6)+"-"+phoneNumber.substring(6));
	}
	
	
	
	/**
	 * gets the input number and replaces space \\ - () to make a real telephone number
	 * @param inputNumber
	 *************************************************************/
	public void setPhone(String inputNumber) {
		this.phoneNumber = inputNumber.replaceAll("[\\s\\-() ]", "");
	}	
	
	

	@Override
	public boolean isValid() {
		/**
		 * check a real phoneNumber length 10 containing only numbers
		 * else returns false.
		 * @param inputNumber
		 * @return validPhoneNumber 
		 *************************************************************/
		if (phoneNumber.matches("[0-9]+") && phoneNumber.length() == 10 ){
			//check further
			validPhoneNumber=true;
		}
		else{
			validPhoneNumber=false;
		}
		
		return validPhoneNumber;
	}
	
	
}	

