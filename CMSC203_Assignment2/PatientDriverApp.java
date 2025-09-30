/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This program creates a Patient object
 * and three Procedure objects. All attributes of each object
 * is user defined. Then, it prints back to the user the patient
 * information, each procedure information, and total charge
 * of all procedures.
 * Due: 10/02/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Iris Chakiath
*/

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Patient patient = new Patient();
		Procedure procedure1 = new Procedure();
		Procedure procedure2 = new Procedure("Check-Up", "09/30/2025");
		Procedure procedure3 = new Procedure("Surgery", "09/29/25", "Dr. Doe", 45.5);
		double total;
		
		//patient information
		System.out.println("Enter your first name: ");
		patient.setFirstName(scanner.nextLine());
		System.out.println("Enter your middle name: ");
		patient.setMiddleName(scanner.nextLine());
		System.out.println("Enter your last name: ");
		patient.setLastName(scanner.nextLine());
		System.out.println("Enter your phone number: ");
		patient.setPhoneNum(scanner.nextLine());
		System.out.println("Enter your street address: ");
		patient.setStreetAddress(scanner.nextLine());
		System.out.println("Enter the city you live in: ");
		patient.setCity(scanner.nextLine());
		System.out.println("Enter the initials of the state you live in: ");
		patient.setState(scanner.nextLine());
		System.out.println("Enter your zip-code: ");
		patient.setZipCode(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter your emergency contact's name: ");
		patient.setNameEmerg(scanner.nextLine());
		System.out.println("Enter your emergency contact's phone number: ");
		patient.setEmergPhone(scanner.nextLine());
		
		//procedure1 information
		System.out.println();
		System.out.println("Enter the name of your procedure: ");
		procedure1.setProcedure(scanner.nextLine());
		System.out.println("Enter the name of your practitioner: ");
		procedure1.setPractitioner(scanner.nextLine());
		System.out.println("Enter the date of your procedure: ");
		procedure1.setDate(scanner.nextLine());
		System.out.println("Enter the cost of your procedure: ");
		procedure1.setCharges(scanner.nextDouble());
		scanner.nextLine();
		
		//procedure2 information
		System.out.println();
		System.out.println("\nEnter the name of your procedure: ");
		procedure2.setProcedure(scanner.nextLine());
		System.out.println("Enter the name of your practitioner: ");
		procedure2.setPractitioner(scanner.nextLine());
		System.out.println("Enter the date of your procedure: ");
		procedure2.setDate(scanner.nextLine());
		System.out.println("Enter the cost of your procedure: ");
		procedure2.setCharges(scanner.nextDouble());
		scanner.nextLine();
		
		//procedure2 information
		System.out.println();
		System.out.println("\nEnter the name of your procedure: ");
		procedure3.setProcedure(scanner.nextLine());
		System.out.println("Enter the name of your practitioner: ");
		procedure3.setPractitioner(scanner.nextLine());
		System.out.println("Enter the date of your procedure: ");
		procedure3.setDate(scanner.nextLine());
		System.out.println("Enter the cost of your procedure: ");
		procedure3.setCharges(scanner.nextDouble());
		scanner.nextLine();
		
		//calculate total cost of procedures
		total = calculateTotalCharges(procedure1.getCharges(), procedure2.getCharges(), procedure3.getCharges());
		
		//display patient information
		System.out.println();
		displayPatient(patient);
		
		//display procedure information
		System.out.println();
		displayProcedure(procedure1);
		System.out.println();
		displayProcedure(procedure2);
		System.out.println();
		displayProcedure(procedure3);
		//display total charges - comma separated with two decimal points
		System.out.println();
		System.out.printf("Total charges: %,.2f \n", total);
		
		//developer information
		System.out.println();
		System.out.println("The program was developed by a student: Iris Chakiath");
		System.out.println("MC#: M21200337");
		System.out.println("Due Date: 09/30/25");
		scanner.close();
	}
	
	/**
	 * given a Patient object, will display patient's information
	 * @param patient is the Patient object
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}
	
	/**
	 * Given a procedure object will display procedure's information
	 * @param procedure is the Procedure object
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	
	/**
	 * 
	 * @param price1 first procedure cost
	 * @param price2 second procedure cost
	 * @param price3 third procedure cost
	 * @return doule value of total cost of price1 + price2 + price3
	 */
	public static double calculateTotalCharges(double price1, double price2, double price3) {
		return price1 + price2 + price3;
	}
}







