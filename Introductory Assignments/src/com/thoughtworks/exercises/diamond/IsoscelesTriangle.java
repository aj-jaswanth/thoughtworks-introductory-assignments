package com.thoughtworks.exercises.diamond;

import java.util.Scanner;

public class IsoscelesTriangle {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if (number >= 0) {
			for (int x = 0; x < number; x++) {
				for (int y = 0; y < number - (x + 1); y++)
					System.out.print(' ');
				for (int y = 0; y < 2 * x + 1; y++)
					System.out.print('*');
				System.out.println();
			}
		}
		scanner.close();
	}
}
