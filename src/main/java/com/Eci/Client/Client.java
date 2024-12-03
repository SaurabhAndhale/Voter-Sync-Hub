package com.Eci.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.Eci.Controller.Controller;
import com.Eci.Entity.Person;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller conn = new Controller();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch;
		do {
			System.out.println("+===================================+");
			System.out.println("|               MENU                |");
			System.out.println("|===================================|");
			System.out.println("| 1. INSERT                         |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 2. View  / Display                |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 3. Update                         |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 4. Delete                         |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 5. Exit...                        |");
			System.out.println("-------------------------------------");

			System.out.println("Enter Your Choice : ");

			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Enter only numeric numbers...");
				e.printStackTrace();
				break;
			}

			switch (ch) {
			case 1:
				try {
					System.out.println("enter adhar number : ");
					int adhar = sc.nextInt();
					System.out.println("Enter Name : ");
					String name = br.readLine();
					System.out.println("Enter Voater id : ");
					String vid = br.readLine();
					System.out.println("Enter constituency : ");
					String cons = br.readLine();
					System.out.println("Enter Houser number : ");
					int houseNo = sc.nextInt();
					System.out.println("Enter City : ");
					String city = br.readLine();
					System.out.println("Enter Pin code : ");
					int pin = sc.nextInt();

					conn.insertPerson(adhar, name, vid, cons, houseNo, city, pin);

				} catch (Exception e) {
					System.out.println("Please don't enter duplicate Aadhr id OR Voter id");
				}
				break;

			case 2:
				List<Person> list = conn.listOfPerson();
				for (Person person : list) {
					System.out.println(person);
				}
				break;

			case 3:

				try {
					System.out.println("enter adhar number : ");
					int adhar = sc.nextInt();
					System.out.println("Enter Name : ");
					String name = br.readLine();
					System.out.println("Enter Voater id : ");
					String vid = br.readLine();
					System.out.println("Enter constituency : ");
					String cons = br.readLine();
					System.out.println("Enter Houser number : ");
					int houseNo = sc.nextInt();
					System.out.println("Enter City : ");
					String city = br.readLine();
					System.out.println("Enter Pin code : ");
					int pin = sc.nextInt();

					conn.updatePerson(adhar, name, vid, cons, houseNo, city, pin);

				} catch (Exception e) {
					System.out.println("Please don't enter duplicate Aadhr id OR Voter id");
				}

				break;
			case 4:
				System.out.println("Enter Aadhar Id: ");
				int adhar = sc.nextInt();

				conn.deletePerson(adhar);
				break;

			case 5:

				break;
			}

		} while (ch != 5);
	}
}
