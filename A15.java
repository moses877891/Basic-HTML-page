//JK Surya
//20450372

import java.util.*;
public class A15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number:");  
		int n = sc.nextInt();  
		sc.close();
		int s = 0;  
		for(int i = 2; i < n/2; i++) 
		{  
			if(n % i == 0)
				s++;  
		}  
		
		if(s == 0) 
			System.out.println("Number is prime");   
		else   
			System.out.println("Number is NOT prime");   
	}
}
