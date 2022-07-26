package com.greatlearning.driver;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter the total number floors in the building : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			a[m] = i;
		}
		int j = n;

		System.out.println("The order of floor construction is as follows ");
		for (int i = 1; i <= n; i++) {

			System.out.println("Day " + i + " :");
			while (j >= 1 && a[j] <= i) {

				System.out.println(j + " ");
				j--;
			}

		}
	}

}
