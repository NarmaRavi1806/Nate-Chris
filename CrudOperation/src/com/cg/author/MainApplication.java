package com.cg.author;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApplication {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainApplication main = new MainApplication();
		String op = "";
		while(true){
		System.out.println("Author Details");
		System.out.println("1. Create");
		System.out.println("2. Update");
		System.out.println("3. Read");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter Your Choice: ");
		op=main.sc.nextLine();
		switch (op) {
		case "1":

			main.createDetails();

			break;
		case "2":
			main.updateDetails();
			break;
		case "3":
			main.readDetails();
			break;
		case "4":
			main.deleteDetails();
			break;
		case "5":
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
		}
	}

	private void createDetails() {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		AuthorDetails author = new AuthorDetails();
		System.out.println("Enter First Name: ");
		author.setFirstName(sc.nextLine());
		System.out.println("Enter Middle Name: ");
		author.setMiddlename(sc.nextLine());
		System.out.println("Enter Last Name: ");
		author.setLastName(sc.nextLine());
		System.out.println("Enter Phone Number: ");
		author.setPhoneNo(Double.parseDouble(sc.nextLine()));

		
		em.persist(author);
		em.getTransaction().commit();

		em.close();
		factory.close();
	}

	private void updateDetails() {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();
		AuthorDetails author = new AuthorDetails();
		em.getTransaction().begin();
		System.out.println("Enter the Id: ");
		int id = Integer.parseInt(sc.nextLine());
		author = em.find(AuthorDetails.class, id);
		System.out.println("Enter Phone Number: ");
		author.setPhoneNo(Double.parseDouble(sc.nextLine()));
		em.persist(author);
		em.getTransaction().commit();
		System.out.println("Author ID:" + author.getAuthorId() + " First Name:"
				+ author.getFirstName() + " Middle Name:"
				+ author.getMiddlename() + " Last Name: "
				+ author.getLastName() + " Phone Number: "
				+ author.getPhoneNo());
		em.close();
		factory.close();
	}

	private void readDetails() {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();
		AuthorDetails auth = new AuthorDetails();
		System.out.println("Enter the Id: ");
		int id = Integer.parseInt(sc.nextLine());
		// auth.setAuthorId(Integer.parseInt(sc.nextLine()));
		auth = em.find(AuthorDetails.class, id);
		System.out.println("Author ID:" + auth.getAuthorId() + " First Name:"
				+ auth.getFirstName() + " Middle Name:" + auth.getMiddlename()
				+ " Last Name: " + auth.getLastName() + " Phone Number: "
				+ auth.getPhoneNo());
	}

	private void deleteDetails() {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();
		AuthorDetails auth = new AuthorDetails();
		em.getTransaction().begin();
		System.out.println("Enter the Id: ");
		int id = Integer.parseInt(sc.nextLine());
		// auth.setAuthorId(Integer.parseInt(sc.nextLine()));
		auth = em.find(AuthorDetails.class, id);
		em.remove(auth);
		em.getTransaction().commit();

		em.close();
		factory.close();
	}

}

