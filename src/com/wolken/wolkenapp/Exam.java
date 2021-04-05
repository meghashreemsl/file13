package com.wolken.wolkenapp;

public class Exam {
	 private int fees;
	 private String code;
	 private HallTicket hallTicket;
	 
	 public boolean allow(HallTicket hallTicket) {
		 // HAS-A relationship
		 System.out.println("inside allow method");
		 boolean check = false;
		 if(fees > 1000) {
			 check = true;
			 if(hallTicket!= null) {
				 this.hallTicket=hallTicket;
				 this.hallTicket.displayInfo();
			 }
			 else {
				 System.out.println("No hallticket found");
			 }
		 }
		 else {
			 System.out.println("Please pay the fees");
		 }
		 System.out.println("end of the allow method");
		return check;
	 }
	 public void setCode(String code) {
		 this.code=code;
	 }
	 public void setFees(int fees) {
		 this.fees=fees;
	 }

}
