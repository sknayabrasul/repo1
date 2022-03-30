package com.lti.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserClass {

	public static void main(String[] args) {
		Student s1=new Student(101,"Ajay",50000);
		System.out.println(s1);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();
	}

}