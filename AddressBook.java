package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	static Contact contacts[] = new Contact[2];


	public static void main(String[] args) {
		System.out.println("Welcome to Address book program");

		int x = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1 Enter Person Details \n2 ShowDetails \n3 Edit by first name \n4 delete by firstName");
			System.out.println("Enter your choise");
			int y = scanner.nextInt();
			switch (y) {
			case 1: {
				System.out.println("How many Person details Do you want to enter ");
				int number = scanner.nextInt();
				for(int i=0;i<number;i++) {
					enterPersonDetails(i);
				}
				break;
			}
			case 2: {
				
				getContact(contacts);
				break;
			}
			case 3: {

				System.out.println("Enter the first name ");
				String firstName = scanner.next();
				for(int i=0;i<contacts.length;i++) {
					Contact contact = contacts[i];
					if(contact.firstName.compareTo(firstName) == 0) {
						System.out.println("Enter the Last name ");
						contact.lastName = scanner.next();

						System.out.println("Enter the Address ");
						contact.address = scanner.next();

						System.out.println("Enter the City name ");
						contact.city = scanner.next();

						System.out.println("Zip code ");
						contact.zip = scanner.nextInt();

						System.out.println("Enter the Mobile Number ");
						contact.mobileNo= scanner.nextLong();

						System.out.println("Enter the EmailId ");
						contact.emailId = scanner.next();

						break;
					}
				}
				break;
			}
			case 4: {
				System.out.println("Enter the first name ");
				String firstName = scanner.next();
				for(int i=0;i<contacts.length;i++) {
					Contact contact = contacts[i];
					if(contact.firstName.compareTo(firstName) == 0) {
						contacts[i] = null;
						break;
					}
				}
				break;
			}
			default:
				//		throw new IllegalArgumentException("Unexpected value: " + y);
			}

			System.out.println("Do you want to continue press 1 ");
			x = scanner.nextInt();
		}while(x!=0);

	}
	public static void enterPersonDetails(int i) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first name ");
		String firstName = scanner.next();

		System.out.println("Enter the Last name ");
		String lastName = scanner.next();

		System.out.println("Enter the Address ");
		String address = scanner.next();

		System.out.println("Enter the City name ");
		String city = scanner.next();

		System.out.println("Zip code ");
		int zip = scanner.nextInt();

		System.out.println("Enter the Mobile Number ");
		long mobileNumber = scanner.nextLong();

		System.out.println("Enter the EmailId ");
		String emailId = scanner.next();
		Contact contact = new Contact(firstName, lastName, address, city, zip, mobileNumber, emailId);
		System.out.println(contact);
		contacts[i] = contact;


	}


	public static void getContact(Contact contacts[]) {
		for (int i = 0; i < contacts.length; i++) {
			Contact contact = contacts[i];
			System.out.println(contact);
		}
	}


}


