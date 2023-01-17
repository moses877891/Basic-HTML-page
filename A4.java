//JK Surya
//20450372

import java.util.*;
public class A4 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    char a =sc.next().charAt(0);
	    sc.close();
	    if(a>=48 && a<=57)
	    {
	        System.out.print("Digit");
	    }
	    else if((a>='a' && a<='z')||(a>='A' && a<='Z'))
	    {
	        System.out.print("Alphabet");
	    }
	    else
	   {
	        System.out.print("special character");
	    }

	}

}
