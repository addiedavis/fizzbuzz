package fizzbuzz;

public class FizzBuzz {

	public String response(int userNumber) {
		if (userNumber % 3 == 0 && userNumber % 5 == 0) {
			return "FizzBuzz";
		} else if (userNumber % 3 == 0) {
			return "Fizz";
		} else if (userNumber % 5 == 0) {
			return "Buzz";
		}
		return "" + userNumber;
	}

}
