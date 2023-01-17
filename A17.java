//JK Surya
//20450372

import java.util.*;
public class A17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number:");  
		int n = sc.nextInt();  
		sc.close();
		int c = 0;  
		for(int i = 2; i < n/2; i++) {  
			if(n % i == 0)
				cn++;  
		}  
		
		if(cn == 0) 
			System.out.println("Number is prime");   
		else   
			System.out.println("Number is NOT prime");   
	}
}
