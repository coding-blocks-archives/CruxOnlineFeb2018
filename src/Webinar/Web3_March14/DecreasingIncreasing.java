package Webinar.Web3_March14;

import java.util.Scanner;

public class DecreasingIncreasing {

	static Scanner scn = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		System.out.println(di(6)) ;

	}
	
	public static boolean di(int n){
		
		boolean gd = true ;
		int prev = scn.nextInt() ;
		
		for(int i=1 ; i <= n-1 ; i++){
			
			int curr =scn.nextInt() ;
			
			if(gd){
				
				if(curr < prev){
					// desired
				}else{
					gd = false ;
				}
			}else{
				if(curr > prev){
					
				}else{
					return false ;
				}
			}
			
			prev = curr ;
		}
		
		return true ;
		
	}

}
