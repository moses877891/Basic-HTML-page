//JK Surya
//20450372

import java.util.*;
public class A5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Add\n2. Sub");
		int choice = sc.nextInt();
		
		int x,y;
		int result;
		if (choice == 1) 
		{
			System.out.println("Enter first number: ");
			x = sc.nextInt();
			System.out.println("Enter second number: ");
			y = sc.nextInt();
			result = x + y;
		} 
		else 
		{
			System.out.println("Enter first number: ");
			x = sc.nextInt();
			System.out.println("Enter second number: ");
			y = sc.nextInt();
			result = x - y;
		}
		
		System.out.println("Result: " + result);
		System.out.println("Do you want to continue? Y or N");
		sc.nextLine();		
		choice = sc.nextLine().charAt(0);
		if (choice == 'Y' || choice == 'y') main(args);
		sc.close();
	}
}
