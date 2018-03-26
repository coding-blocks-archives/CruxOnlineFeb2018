package Webinar.Web1_Feb28;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;

		int nr = 2 * n - 1;
		int nst = (nr / 2) + 1;

		while (row <= nr) {

			// work to be done in every row

			int cst = 1;
			while (cst <= nst) {

				System.out.print("*");
				cst = cst + 1;
			}

			// prep for next row
			System.out.println();

			if (row <= nr / 2) {
				nst = nst - 1;
			} else {
				nst = nst + 1;
			}
			row = row + 1;
		}

	}

}
