//JK Surya
//20450372

import java.util.*;
public class A3 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);  
		 System.out.print("Enter color code :");  
		 char color = sc.next().charAt(0); 
		 sc.close();
		 switch(color){  
		 	case 'R' :  
				System.out.println("Red");  
				break;  
		 	case 'B' :  
				System.out.println("Blue"); 
				break;  
		 	case 'G' :  
				System.out.println("Green");
				break;  
		 	case 'O' :  
				System.out.println("Orange");
				break;  
		 	case 'Y' :  
				System.out.println("Yellow");
				break;  
		 	case 'W' :  
				System.out.println("White"); 
				break;  
		 	default :  
				System.out.println("Invalid Code");  
		 }  

	}

}
