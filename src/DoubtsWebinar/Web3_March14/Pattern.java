package DoubtsWebinar.Web3_March14;

public class Pattern {

	public static void main(String[] args) {

		printpattern1(7);

	}

	public static void printpattern(int n) {

		int nst = 1;
		int nsp = n - 1;

		int row = 1;
		int val;
		while (row <= n) {

			val = row;
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
				if (cst <= nst / 2)
					val++;
				else
					val--;
			}

			row++;
			nst += 2;
			nsp--;
			System.out.println();

		}

	}

	public static void printpattern1(int n) {

		int nst = n / 2 + 1;
		int nsp = -1;

		int row = 1;

		while (row <= n) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			int cst = 1;
			if (row == 1 || row == n) {
				cst = 2;
			}
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}

			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			row++;

			System.out.println();

		}

	}

}
