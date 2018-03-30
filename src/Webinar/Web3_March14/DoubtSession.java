package Webinar.Web3_March14;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DoubtSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(inv(3142));
//		int[] arr = { 3, 8, 1, 5, 6 };
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		Scanner scn = new Scanner(System.in) ;
		char ch = scn.nextLine().charAt(0) ;
		
	}

	public static int inv(int num) {
		int counter = 1;
		int power = 1;
		int inv = 0;
		while (num != 0) {
			int rem = num % 10;
			power = 1;
			while (rem != 1) {
				power = power * 10;
				rem--;
			}
			inv = inv + counter * power;
			counter++;
			num = num / 10;
		}
		return inv;
	}

}
