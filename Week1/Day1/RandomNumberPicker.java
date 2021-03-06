package com.lavenberg;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberPicker {
	public static void main(String[] args) {
		Random generator = new Random();
		int answer =  1 + generator.nextInt(100);
		int tries = 0;

		Scanner input = new Scanner (System.in);
		int guess;

		System.out.println("You get five tries to guess a number between 1 and 100:");

		while (tries < 5)
		{
			System.out.println("Enter a number: ");
			guess = input.nextInt();
			
			if (guess == answer)
			{
				System.out.println("You guessed right!");
				break;
			}
		//  if user number +/-10, exit loop and give the answer
			else if (guess > (answer - 10) && guess < (answer + 10))
			{		
				System.out.println("Wrong Number. The correct number is: " + answer);
				break; 
			}
			
			else if (guess < (answer - 10) && guess > (answer + 10))
			{
				continue;
			}
				tries++;
		}
		    if (tries > 5)
		    {
			System.out.println("Sorry. The correct number is: " + answer);
			System.exit(0);
		        
		    }
	}
}


