/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: This program asks the user for a movie, 
 * the rating of the movie, and the number of tickets sold. 
 * Then, it displays back the information to the user. 
 * Due: 9/30/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Iris Chakiath
*/
import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Movie movie = new Movie();
		
		//get movie info
		System.out.println("Enter the name of a movie ");
		movie.setTitle(scanner.nextLine());
		System.out.println("Enter the rating of a movie ");
		movie.setRating(scanner.nextLine());
		System.out.println("Enter the number of tickets sold for this movie ");
		movie.setSoldTickets(scanner.nextInt());
		
		//end message + movie info
		System.out.println();
		System.out.println(movie.toString());
		System.out.println("\nGoodbye");
		
		scanner.close();

	}

}
