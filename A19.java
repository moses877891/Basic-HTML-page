//JK Surya
//20450372

import java.util.*;
public class A19{

	public static void main(String[] args) {
		
		int count;  
		if(args.length == 0) 
		{  
			Scanner sc = new Scanner(System.in);  
			System.out.println("Please enter an integer number:");  
			count = sc.nextInt();
			sc.close();
		}  
		else 
		{  
			count = Integer.parseInt(args[0]);  
		}  
		
		for(int i = 1; i <= count; i++)
		{  
			for(int j = 1; j <=i; j++) 
			{  
				System.out.print("*");  
			}  
			System.out.println(" ");  
		}
	}
}
