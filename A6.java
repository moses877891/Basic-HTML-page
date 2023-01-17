//JK Surya
//20450372

public class A6 {

	public static void main(String[] args) {
		
		int s = 0, n= 1;  
		
		while(s < 5) {  
			if(n%2 == 0 && n%3 == 0 && n%5 == 0) {  
				System.out.print(n + " ");  
				s++;  
			}  
		n++;  
		}

	}
}
