package com.thoughtworks.exercises.factors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {

	private static int[] primes;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		List<Integer> factorsList = generate(number);
		for (int n : factorsList)
			System.out.print(n + " ");
		System.out.println();
		scanner.close();
	}

	private static List<Integer> generate(int number) {
		findPrimesBelow(number);
		List<Integer> list = new ArrayList<Integer>();
		while (number > 1) {
			for (int x = 2; x <= number; x++) {
				if (primes[x] == 1) {
					if (number % x == 0) {
						list.add(x);
						number /= x;
						break;
					}
				}
			}
		}
		return list;
	}

	private static void findPrimesBelow(int number) {
		primes = new int[number];
		for (int x = 0; x < number; x++)
			primes[x] = 1;
		primes[0] = primes[1] = 0;
		for (int x = 3; x < number; x++) {
			if (x % 2 == 0) {
				primes[x] = 0;
				continue;
			}
			for (int y = 2; y < number / x; y++)
				primes[x * y] = 0;
		}
		primes[2] = 1;
	}
}
