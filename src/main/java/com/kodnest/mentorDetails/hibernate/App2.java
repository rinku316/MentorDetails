package com.kodnest.mentorDetails.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	System.out.println("Enter the id to fetch mentorDetail");
    	
    	Mentor ref = session.get(Mentor.class, scan.nextInt());
    	
    	System.out.println(ref);
    	
    	session.close();
    	factory.close();

	}

}
