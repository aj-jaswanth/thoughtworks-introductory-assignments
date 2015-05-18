package com.thoughtworks.exercises.triangle;

import java.util.Scanner;

public class VerticalLine {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if (number >= 0) {
			for (int x = 0; x < number; x++)
				System.out.println('*');
		}
		scanner.close();
	}
}
