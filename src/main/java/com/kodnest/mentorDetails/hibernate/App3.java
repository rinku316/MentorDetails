package com.kodnest.mentorDetails.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	System.out.println("Enter id to delete the Metordetail");
    	
    	int id = scan.nextInt();
    	
    	Mentor mentor = session.get(Mentor.class, id);
    	
    	if (mentor != null) {
    		session.remove(mentor);
    	} else {
    		System.out.println("Envalid number of " + id + "not available");
    	}
    	
    	transaction.commit();
    	
    	session.close();
    	factory.close();
	}

}
