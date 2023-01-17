//JK Surya
//20450372

import java.util.*;
public class A18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number :");  
		int n = sc.nextInt();
		sc.close();
		
		int digit, reverse = 0;  
		
		while(n > 0) {  
			digit = n % 10;  
			reverse = reverse * 10 + digit;  
			n = n / 10;  
		}  
		System.out.println(reverse); 

	}

}
