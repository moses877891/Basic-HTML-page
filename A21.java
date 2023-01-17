//JK Surya
//20450372

import java.util.*;
public class A21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		int num = sc.nextInt();
		sc.close();
		int sum;  
		for(sum = 0; num > 0; num = num/10) 
		{  
			sum = sum + (num % 10);
		}  
		System.out.println(sum); 
	}

}
