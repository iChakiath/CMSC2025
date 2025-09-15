/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This program tests the user's ESP skills by having the computer randomly choose a color 
 * which the user must then guess.
 * Due: 09/16/2025
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Iris Chakiath
*/

import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ESPGame {

	public static void main(String[] args) {
		try
		{
			//objects
			Scanner scanner = new Scanner(System.in);
			File myFile = new File("colors.txt");
			Scanner fileReader = new Scanner(myFile);
			PrintWriter writer = new PrintWriter("EspGameResults.txt");
			Random random = new Random();
			
			//variables
			int choice = 0, numRight = 0, computerNum = 0;
			final int NUM_ROUNDS = 3;
			String continueGame = "", name = "", dueDate = "", userDesc = "", fileName = "", guess = "";
			boolean valid = false;
			
			//color constants
			final String COLOR_1 = "black", COLOR_2 = "white", COLOR_3 = "gray", COLOR_4 = "silver", COLOR_5 = "maroon";
			final String COLOR_6 = "red", COLOR_7 = "purple", COLOR_8 = "fuchsia", COLOR_9 = "green", COLOR_10 = "lime";
			final String COLOR_11 = "olive", COLOR_12 = "yellow", COLOR_13 = "navy", COLOR_14 = "blue", COLOR_15 = "teal";
			final String COLOR_16 = "aqua";
			
			//intro
			System.out.println("CMSC203 Assignment1: Test your ESP skills!");
			System.out.println("Welcome to ESP - extrasensory perception!");
			do 
			{
				//resetting variables/objects
				valid = false;
				fileReader = new Scanner(myFile);
				
				//menu
				System.out.println("Would you please choose one of the 4 options from the menu:");
				System.out.println("\t1- read and display on the screen first 16 names from "
									+ "a file colors.txt,so the player can select one of them"
									+ "names of colors.");
				System.out.println("\t2- read and display on the screen first 10 names from "
									+ "a file colors.txt,so the player can select one of them"
									+ "names of colors.");
				System.out.println("\t3- read and display on the screen first 5 names from "
									+ "a file colors.txt,so the player can select one of them"
									+ "names of colors.");
				System.out.println("\t4- Exit from a program");
				
				//get menu selection
				while (valid == false) {
					System.out.println("Enter the option: ");
					choice = scanner.nextInt();
					scanner.nextLine(); //buffer
					
					if (choice == 1 || choice == 2 || choice == 3 || choice == 4) 
						valid = true;
					else
						System.out.println("Please enter a valid selection.");	
				}//end while
				
				//if they don't wish to continue
				if(choice == 4)
					break;
								
				//validate user input
				valid = false;
				while (valid == false) {
					System.out.println("Enter the filename: ");
					fileName = scanner.nextLine();
					
					if (fileName.equals("colors.txt")) { 
						valid = true;
					}
					
					else
						System.out.println("Please enter the correct file name.");
				}//end while
				valid = false;
				
				//read and print in inputs from file
				switch(choice) 
				{
					case 1:
						//to read all colors from file
						while(fileReader.hasNext()) {
							System.out.println(fileReader.nextLine());
						}
						break;
						
					case 2:
						//only 10 colors from file
						for(int i = 0; i < 10; i++) {
							System.out.println(fileReader.nextLine());
						}
						break;
						
					case 3:
						//only 5 colors from file
						for(int i = 0; i < 5; i++) {
							System.out.println(fileReader.nextLine());
						}
						break;
												
					default:
						System.out.println("Error");
				}
				
				
				//3 rounds of:
				for(int i = 1; i <= NUM_ROUNDS; i++) {
					//get randomNum
					switch (choice) {
						case 1:
							//between 1-16
							computerNum = 1 + random.nextInt(16);
							break;
						case 2:
							//between 1-10
							computerNum = 1 + random.nextInt(10);
							break;
						case 3:
							//between 1-5
							computerNum = 1 + random.nextInt(5);
							break;
						default:
							System.out.println("Error");
					}
					
					//get user guess
					System.out.println("Round " + i + "\n");
					System.out.println("I am thinking of a color. \nIs it one of the colors above?"
							+ "\nEnter your guess: ");
					guess = scanner.nextLine();
					
					//compare computer color with user color based on computerNum
					switch (computerNum) {
					case 1:
						System.out.println("I was thinking of " + COLOR_1 + ".");
						if(COLOR_1.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 2:
						System.out.println("I was thinking of " + COLOR_2 + ".");
						if(COLOR_2.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 3:
						System.out.println("I was thinking of " + COLOR_3 + ".");
						if(COLOR_3.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 4:
						System.out.println("I was thinking of " + COLOR_4 + ".");
						if(COLOR_4.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 5:
						System.out.println("I was thinking of " + COLOR_5 + ".");
						if(COLOR_5.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 6:
						System.out.println("I was thinking of " + COLOR_6 + ".");
						if(COLOR_6.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 7:
						System.out.println("I was thinking of " + COLOR_7 + ".");
						if(COLOR_7.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 8:
						System.out.println("I was thinking of " + COLOR_8 + ".");
						if(COLOR_8.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 9:
						System.out.println("I was thinking of " + COLOR_9 + ".");
						if(COLOR_9.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 10:
						System.out.println("I was thinking of " + COLOR_10 + ".");
						if(COLOR_10.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 11:
						System.out.println("I was thinking of " + COLOR_11 + ".");
						if(COLOR_11.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 12:
						System.out.println("I was thinking of " + COLOR_12 + ".");
						if(COLOR_12.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 13:
						System.out.println("I was thinking of " + COLOR_13 + ".");
						if(COLOR_13.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 14:
						System.out.println("I was thinking of " + COLOR_14 + ".");
						if(COLOR_14.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 15:
						System.out.println("I was thinking of " + COLOR_15 + ".");
						if(COLOR_15.equalsIgnoreCase(guess))
							numRight++;
						break;
					case 16:
						System.out.println("I was thinking of " + COLOR_16 + ".");
						if(COLOR_16.equalsIgnoreCase(guess))
							numRight++;
						break;
					default:
						System.out.println("Error");
					}//end switch
					
				}//end for
				
				System.out.println("Game Over");
				System.out.println("You guessed " + numRight + " out of 3 colors correctly.");

				System.out.println("Would you like to continue a game? Type Yes/No\n");
				continueGame = scanner.nextLine();
				
				//if user would like to continue, reset numRight
				if (continueGame.equals("yes"))
					numRight = 0;
				
				//close to reset position when reading from file
				fileReader.close();
				
			}while(choice != 4 && !continueGame.equalsIgnoreCase("no"));
			
			//ask user info
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
			System.out.println("Describe yourself: ");
			userDesc = scanner.nextLine();
			System.out.println("Due Date: ");
			dueDate = scanner.nextLine();

			//print back above info
			System.out.println("Username: " + name + "\nUser Description: " +
			userDesc + "\nDate: " + dueDate);
			
			//write info to file
			writer.println("Game Over \nYou guessed " + numRight + " out of 3 correctly.");
			writer.println("Username: " + name + "\nUser Description: " +
					userDesc + "\nDate: " + dueDate);
			
			//close objects
			scanner.close();
			writer.close();
			System.out.println("\n\nProgrammer: Iris Chakiath");

		}//end try
		
		catch (FileNotFoundException e) {
			System.out.println("Error");
		}//end catch

	}//end main
	
}//end ESPGame class
