package com.kodnest.mentorDetails.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	System.out.println("Enter the id of mentor to update men tor details");
    	int id = scan.nextInt();
    	Mentor ref = session.get(Mentor.class, id);
    	
    	if (ref != null) {
    		
    		while (true) {
    	
		    	System.out.println("press 1 to update mentor name");
		    	System.out.println("press 2 to update mentor gender");
		    	System.out.println("press 3 to update mentor subject");
		    	System.out.println("press 4 to update mentor phoneNo");
		    	System.out.println("press 5 to update mentor Email");
		    	System.out.println("press 6 to update mentor experiance");
		    	System.out.println("press 7 to update mentor qualification");
		    	System.out.println("press 8 to update mentor noOfBatches");
		    	System.out.println("press 9 to update mentor maritalStatus");
		    	System.out.println("press 10 to update mentor salary");
		    	
		    	
		    	int choice = scan.nextInt();
		    	
			    	if (choice == 11) {
			    		break;
			    	}
		    	
			    	switch (choice) {
			    	
			    	case 1:  {
			    		System.out.println("Enter new Name");
			    		String mentorname = scan.next();
			    		ref.setName(mentorname);
			    	}
			    	
			    	case 2:  {
			    		System.out.println("enter the new Gender");
			    		String gender = scan.next();
			    		ref.setGender(gender);
			    	}
			    	
			    	case 3:  {
			    		System.out.println("enter the new subject");
			    		String subject = scan.next();
			    		ref.setSubject(subject);
			    	}
			    	
			    	case 4:  {
			    		System.out.println("enter the new phoneNo");
			    		String phone = scan.next();
			    		ref.setPhoneNo(phone);
			    	}
			    	
			    	case 5:  {
			    		System.out.println("enter the new email");
			    		String email = scan.next();
			    		ref.setEmailId(email);
			    	}
			    	
			    	case 6:  {
			    		System.out.println("enter the new experiance");
			    		int exp = scan.nextInt();
			    		ref.setExperience(exp);
			    	}
			    	
			    	case 7:  {
			    		System.out.println("enter the new Qualification");
			    		String qualification = scan.next();
			    		ref.setQualfication(qualification);
			    	}
			    	
			    	case 8:  {
			    		System.out.println("enter the new No of Betch");
			    		int noOfBetch = scan.nextInt();
			    		ref.setNoOfBatches(noOfBetch);
			    	}
			    	
			    	case 9:  {
			    		System.out.println("enter the new merriatalStatus");
			    		String meritalStatus = scan.next();
			    		ref.setMaritalStatus(meritalStatus);
			    	}
			    	case 10:  {
			    		System.out.println("enter the new Salary");
			    		int salary = scan.nextInt();
			    		ref.setSalary(salary);
			    	}
			    	
			    	default : {
			    		System.out.println("Invaled operation selected plese try again");
			    	}
			    	
		    	}
	    	
    		}
    		session.persist(ref);
    		transaction.commit();
    		
    		session.close();
    		factory.close();
    	}
    	
    	else {
    		System.out.println("Mentor with Id " + id + "Is not available to update");
    	}
    	
    	
	}

}
