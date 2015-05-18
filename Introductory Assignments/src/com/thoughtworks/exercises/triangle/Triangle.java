package com.thoughtworks.exercises.triangle;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if (number >= 0) {
			for (int x = 0; x < number; x++) {
				for (int y = 0; y < x + 1; y++)
					System.out.print('*');
				System.out.println();
			}
		}
		scanner.close();
	}
}
