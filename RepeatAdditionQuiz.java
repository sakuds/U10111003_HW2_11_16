
//U10111003 朱永捷

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz{
	public static void main(String[] args) {
    // Create datafields
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// Create a list to store answers
		ArrayList<Integer> userAnswer = new ArrayList<Integer>();

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Let user answer this question 
		System.out.print("What is " + number1 + " * " + number2 + "? ");
		int answer = input.nextInt();

		// To check the answer and store the wrong answer
		while (number1 * number2 != answer) {
			if (userAnswer.contains(answer)){
				System.out.println("You already entered " + answer);
			}
			userAnswer.add(answer);
			System.out.print("Wrong answer. Try again. What is " + number1 + " * " + number2 + "? ");
			answer = input.nextInt();
		}

		System.out.println("You got it!");
	}
}
