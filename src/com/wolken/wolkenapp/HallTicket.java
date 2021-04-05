package com.wolken.wolkenapp;

public class HallTicket {
	 public String usn;
	 public String subjectcode;
	 public String subjectname;
		 
		 public HallTicket(String usn, String subjectcode, String subjectname) {
		 this.usn=usn;
		 this.subjectcode=subjectcode;
		 this.subjectname=subjectname;
	}
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.usn);
		System.out.println(this.subjectcode);
		System.out.println(this.subjectname);
		
		
	}

}
