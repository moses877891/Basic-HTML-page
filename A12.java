//JK Surya
//20450372

public class A12 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);  
		int temp = num, digit, reverse = 0;  
		
		while(temp > 0) 
		{  
			digit = temp % 10;  
			reverse = reverse * 10 + digit;  
			temp = temp / 10;  
		}  
		if(num == reverse) 
		{  
			System.out.println(num + " is a palindrome");  
		}  
		else 
		{  
			System.out.println(num + " is not a palindrome");  
		}  

	}

}
