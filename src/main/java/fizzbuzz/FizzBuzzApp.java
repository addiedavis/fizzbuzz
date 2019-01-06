package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {

		FizzBuzz myFizzBuzzGame = new FizzBuzz();

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to FizzBuzz.");
		System.out.println("Please pick a number greater than 0.");

		int userNumber = input.nextInt();
		
		System.out.println(myFizzBuzzGame.response(userNumber));
		input.close();
	}

}
