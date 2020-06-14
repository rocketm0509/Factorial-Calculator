package Factorials;

import java.util.Scanner;

public class factorialClass {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number!");
		int n = num.nextInt();
		
			int i,fact=1;  
			
			
			  for(i=n; i>0; i--){    
			      fact=fact*i;    
			  } 
			  
			  System.out.println(n + "! = " + fact);    
			  
			 }  
			
		

	}




