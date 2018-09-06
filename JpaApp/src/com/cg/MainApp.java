package com.cg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class MainApp {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		
		user.setUserName("Loga");
		user.setAge(28);
		user.setGender("male");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em=factory.createEntityManager();
		
		TypedQuery<UserDetails> q=em.createNamedQuery("getAllUsers",UserDetails.class);
		List<UserDetails> ll=q.getResultList();
		for (UserDetails userDetails : ll) {
			System.out.println(userDetails);
		}
		
//		em.getTransaction().begin();
//		em.persist(user);
//		em.getTransaction().commit();
		//Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Gender : ");
//		String gen=sc.nextLine();
//		System.out.println("Enter User ID : ");
//		int id=Integer.parseInt(sc.nextLine());
		
//		String strQuery="Select u from UserDetails u Where u.id=?";
//		TypedQuery<UserDetails> query=em.createQuery(strQuery,UserDetails.class);
//		query.setParameter(1, id);
//		List<UserDetails> users=query.getResultList();
//		for (UserDetails userDetails : users) {
//			System.out.println(userDetails);
//		}
//		users.forEach(System.out::println);
		
//		em.getTransaction().begin();
//		em.persist(user);
//		em.getTransaction().commit();
//		System.out.println("Done");
		em.close();
		factory.close();
		
		

	}

}
