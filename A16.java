//JK Surya
//20450372

import java.util.*;
public class A16 {

	public static void main(String[] args) {
		
		int n = 0;  
		if(args.length >= 1) {  
			n = Integer.parseInt(args[0]);  
		}  
		else {  
			Scanner sc = new Scanner(System.in);  
			System.out.print("Please enter an integer number ");  
			n = sc.nextInt();
			sc.close();
		}  
		if(n == 0 || n == 1) {  
			System.out.println(num + " is neither prime nor composite");  
		}  
		else {  
			if(isPrime(n))  
				System.out.println(num + " is a prime number");  
			else  
				System.out.println(num + " is a not prime number");  
		} 
	}  
		
	public static boolean isPrime(int num) {  
		for(int i=2; i <= num/2; i++) {  
			if(num % i == 0)  
				return false;  
		}  
		return true;  
	}  

}

