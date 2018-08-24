package DoubtsWebinar.Web1_Feb28;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;

		while (row <= n) {

			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col = col + 1;
			}

			System.out.println();
			row = row + 1;
		}
	}

}
