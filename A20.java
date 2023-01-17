//JK Surya
//20450372

import java.util.*;
public class A20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		int n = sc.nextInt();
		sc.close();
		int sum;  
		for(sum = 0; n > 0; n = n/10)   
		{
			sum = sum + (n % 10);
		}  
		System.out.println(sum); 
	}

}
