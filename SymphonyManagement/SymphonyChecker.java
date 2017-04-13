/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class SymphonyChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPhoneValid();
		checkTimeValid();
		

	}

	private static void checkTimeValid() {
		Minute nine=new Minute(9);
		Minute ten=new Minute("10");
		Minute lots=new Minute("100");
		
		Hour   hlots= new Hour("100");
		Hour   hnine= new Hour("19");
		
		Time testTime=new Time(hnine.getHour(), nine.getMin());
		Time testTime2=new Time(24, 59);
		Time testTime3=new Time(100, 59);
		
		System.out.println("Minute nine is : "+nine.getMinString()+"\n");
		System.out.println("Minute ten is : "+ten.getMinString()+"\n");
		System.out.println("Minute lots is : "+lots.getMinString()+"\n");
		System.out.println("Minute lots is valid?: "+lots.isValid()+"\n");
		System.out.println("Hour hlots is valid?: "+hlots.isValid()+" "+hlots.getHourString()+"\n");
		System.out.println("testTime is valid?: "+testTime.isValid()+" "+" "+testTime.toString()+"\n");
		System.out.println("testTime2 is valid?: "+testTime2.isValid()+" "+" "+testTime2.toString()+"\n");
		System.out.println("testTime3 is valid?: "+testTime3.isValid()+" "+" "+testTime3.toString()+"\n");
	}

	private static void checkPhoneValid() {
		Phone number1= new Phone();
		Phone number2= new Phone("613 222-3333");
		Phone number3= new Phone("613 2223-3333");
		Phone number4= new Phone("613 two-thre");
		System.out.println("number1 is : "+number1.isValid()+"\n");
		System.out.println("number2 is : "+number2.isValid()+"\n");
		System.out.println("number3 is : "+number3.isValid()+"\n");
		System.out.println("number4 is : "+number4.isValid()+"\n");
		
		System.out.println("number4's number is : "+number4.getPhoneNumber()+"\n");
		
	}

}

