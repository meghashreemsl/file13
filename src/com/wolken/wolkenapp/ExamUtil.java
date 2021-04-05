package com.wolken.wolkenapp;
import com.wolken.wolkenapp.Exam;
import com.wolken.wolkenapp.HallTicket;

public class ExamUtil {
	public static void main(String[] args) {
		Exam exam = new Exam();
		exam.setCode("2010AAT");
		exam.setFees(1200);
		//HallTicket hallTicket = null;
		
		HallTicket hallTicket = new HallTicket("2010AAT","12FDGT","digitals");
		exam.allow(hallTicket);// caller- arguments
		//SupplementaryExam supplementaryExam = new SupplementaryExam();
		//upcasting polymorphism
		 Exam supplementaryExam = new SupplementaryExam();
		supplementaryExam.allow(hallTicket);
	}
}
