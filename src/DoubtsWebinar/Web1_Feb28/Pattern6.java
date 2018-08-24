package DoubtsWebinar.Web1_Feb28;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while (row <= n) {

			// work to be done in every row
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			// prep for next row
			System.out.println();
			nst = nst + 2;
			nsp = nsp - 1;
			row = row + 1;
		}

	}

}
