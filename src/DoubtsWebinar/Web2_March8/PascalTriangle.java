package DoubtsWebinar.Web2_March8;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        
        int N=s.nextInt();
        
        int row=0,col=0,value=1;
        while(row<N){
        	
        	col=0;
        	value=1;
        	while(col<=row){
        		System.out.print(value+"\t");
        		value=(value*(row-col))/(col+1);
        		col++;
        	}
        	
        	System.out.println();
        	row++;
        }
	}

}
