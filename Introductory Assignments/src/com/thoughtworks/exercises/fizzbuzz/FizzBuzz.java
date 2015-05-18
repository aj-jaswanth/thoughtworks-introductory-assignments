package com.thoughtworks.exercises.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		fizzBuzz();
	}

	private static void fizzBuzz() {
		for (int x = 1; x < 101; x++) {
			boolean threeDivisible = (x % 3 == 0);
			boolean fiveDivisible = (x % 5 == 0);
			if (threeDivisible && fiveDivisible)
				System.out.println("FizzBuzz");
			else if (threeDivisible)
				System.out.println("Fizz");
			else if (fiveDivisible)
				System.out.println("Buzz");
			else
				System.out.println(x);
		}
	}
}
