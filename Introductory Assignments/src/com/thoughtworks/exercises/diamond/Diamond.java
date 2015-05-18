package com.thoughtworks.exercises.diamond;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if (number >= 0 && (number % 2 == 1)) {
			int center = (number / 2);
			int x;
			for (x = 0; x <= center; x++) {
				for (int y = 0; y < number - (x + 1); y++)
					System.out.print(' ');
				for (int y = 0; y < 2 * x + 1; y++)
					System.out.print('*');
				System.out.println();
			}
			for (int z = x - 1; z > 0; z--) {
				for (int y = 0; y < number - z; y++)
					System.out.print(' ');
				for (int y = 0; y < 2 * (z - 1) + 1; y++)
					System.out.print('*');
				System.out.println();
			}
		}
		scanner.close();
	}
}
