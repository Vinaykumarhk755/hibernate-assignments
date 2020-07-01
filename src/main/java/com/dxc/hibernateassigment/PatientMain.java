package com.dxc.hibernateassigment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class PatientMain {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();		
		Transaction transaction = session.beginTransaction();
		Scanner scanner=new Scanner(System.in);
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient();
		
		System.out.println("enter the pateint details patient id - patient name--patient desiese-patient location");
		
			System.out.println("id:");
		patient1.setPatientId(scanner.nextLong());
		System.out.println("name:");
		patient1.setPatientName(scanner.next());
		System.out.println("desiese:");
		patient1.setDisease(scanner.next());
		System.out.println("location:");
		patient1.setLocation(scanner.next());
		System.out.println("id:");
		patient2.setPatientId(scanner.nextLong());
		System.out.println("name:");
		patient2.setPatientName(scanner.next());
		System.out.println("desiese:");
		patient2.setDisease(scanner.next());
		System.out.println("location:");
		patient2.setLocation(scanner.next());
		System.out.println("id:");
		patient3.setPatientId(scanner.nextLong());
		System.out.println("name:");
		patient3.setPatientName(scanner.next());
		System.out.println("desiese:");
		patient3.setDisease(scanner.next());
		System.out.println("location:");
		patient3.setLocation(scanner.next());
		
	if(patient1.getDisease().equals("fever"))
	{
		session.persist(patient1);
	}
	else if(patient2.getDisease().equals("fever"))
	{
		session.persist(patient2);
	}
	else if(patient3.getDisease().equals("fever"))
	{
		session.persist(patient3);
	}
		/*
		 Patient patient1 = new Patient();
		 
		patient1.setPatientId(101);
		patient1.setPatientName("Ashok");
		patient1.setDisease("Cancer");
		patient1.setLocation("Bangalore");
		
		Patient patient2 = new Patient();
		patient2.setPatientId(102);
		patient2.setPatientName("Manoj");
		patient2.setDisease("Heart Problem");
		patient2.setLocation("Mangalore");
			
		Patient patient3 = new Patient();
		patient3.setPatientId(103);
		patient3.setPatientName("Manjunath");
		patient3.setDisease("Blood Cancer");
		patient3.setLocation("Gadag");
			
			*/
			
			
			/*session.persist(patient2);
			session.persist(patient3); */
			transaction.commit();
			session.close();
	

	}

}
