package com.gmail.yu.omelyanchu;

import java.util.Scanner;

public class Main {
	private static void wallpaper(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}

			}
			System.out.println();
		}
	}

	private static void factorial(int n) {
		if (n > 4 && n < 16) {
			int factorial = 1;
			for (int i = 2; i <= n; i++) {
				factorial *= i;
			}
			System.out.println(factorial);

		}
	}

	private static void multiplicationTable(int n) {
		System.out.println("multiplication Table by " + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + n + "=" + i * n);
		}
	}

	private static void rectangle(int height, int width) {
		height -= 1;
		for (int i = 0; i < height * 2; i++) {
			if (i % 2 == 0 || i == (height * 2 - 1)) {
				for (int j = 0; j < width; j++) {
					if (j == 0 || j == (width - 1) || i == 0 || i == (height * 2 - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
			if (i == (height * 2 - 2)) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		int width;
		System.out.println("input height wallpaper");
		height = sc.nextInt();
		System.out.println("input width wallpaper");
		width = sc.nextInt();
		// tasc 1
		wallpaper(height, width);

		// tasc 2
		System.out.println("input number for factorial");
		factorial(sc.nextInt());

		// tasc 3
		System.out.println("input number for number for the multiplication table");
		multiplicationTable(sc.nextInt());

		// tasc 4
		System.out.println("input rectangle height");
		height = sc.nextInt();
		System.out.println("input rectangle width");
		width = sc.nextInt();
		rectangle(height, width);

	}

}
