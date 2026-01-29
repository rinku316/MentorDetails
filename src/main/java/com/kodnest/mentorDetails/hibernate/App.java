package com.kodnest.mentorDetails.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Mentor (name, gender, subject, phoneNo, emailId, experiance, qualification, noOfbatches, Address, maritalStatus, Salary)");
        Mentor mentor = new Mentor(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
        
        //step-1
         SessionFactory factory = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
         
         // step2 openSession
          Session session = factory.openSession();
          
         // step3   beginTransaction
         Transaction  transaction = session.beginTransaction();
         
         // step4
         session.persist(mentor);
         
         transaction.commit();
         
         session.close();
         factory.close();
         
    }
}
