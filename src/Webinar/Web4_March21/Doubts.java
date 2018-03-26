package Webinar.Web4_March21;

import java.util.Scanner;

public class Doubts {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		//Pattern(5);

		char ch = scn.nextLine().charAt(0);
		System.out.println(ch);

	}

	public static void Pattern6(int n) {

		int nst = n;
		int nsp = 0;

		for (int row = 1; row <= n; row++) {

			int val = row;
			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);

			}

			nst--;
			nsp += 2;
			System.out.println();
		}

	}

	public static void Pattern7(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n; col++) {

				if (row == 1 || row == n || col == 1 || col == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void Pattern(int n) {

		int tr = 2 * n - 1;
		int nst = 1;
		int nsp = tr / 2;

		for (int row = 1; row <= tr; row++) {

			int val;
			if (row <= tr / 2 + 1)
				val = row;
			else
				val = tr - row + 1;
			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
				if (cst <= nst / 2)
					val++;
				else
					val--;
			}

			if (row <= tr / 2) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
			System.out.println();
		}

	}

}
