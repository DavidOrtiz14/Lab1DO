

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

	public class Lab1 {
	    

	public static void main(String[] args) {
	        
	 ArrayList<Integer> a = new ArrayList <> ();
	       
	        System.out.println("Requests Num?>>>>>>");
	        Scanner sc1 = new Scanner(System.in);
	        int n =sc1.nextInt();
	        Scanner sc = new Scanner(System.in);
	        int index =0;
	     
	  for(int i=0;i<n;i++){
		     System.out.println("Enter numbers>>>>>>");
	         String num = sc.nextLine();
	         
	        if(num.charAt(0)=='3') {
		         System.out.println("Size:"+a.size());
		         continue;
            }
	         
	        if(num.length()!=3||num.contains(" ")==false) {
	         System.out.println("Invalid number.");
	          continue;
	        }
	      
	        if(num.charAt(0)=='1') {
	        	int numR=Integer.parseInt(String.valueOf(num.charAt(2)));
	        	a.add(numR);
	         System.out.println(a);
	        
	        }
	        if(num.charAt(0)=='2') {
	        	int numR=Integer.parseInt(String.valueOf(num.charAt(2)));
	        	if(a.contains(numR)) {
	        		a.remove(a.indexOf(numR));
	        	}
	        	
		     System.out.println(a);
		         
	        }
	      
	     
	    }
  
	}
	

}
