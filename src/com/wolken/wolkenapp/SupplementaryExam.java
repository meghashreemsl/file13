package com.wolken.wolkenapp;
// child class
public class SupplementaryExam extends Exam{
	
	public boolean allow(HallTicket ticket) {
		boolean check= super.allow(ticket);
		return check;
		//  the above two sentences can be reduced to  - return super.allow(ticket);
	}
	

}
