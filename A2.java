//JK Surya
//20450372

public class A2 {

	public static void main(String[] args) {
		
        char a=args[0].charAt(0);
        char b;
        if(Character.isLowerCase(a))
            b= Character.toUpperCase(a);
        else
            b= Character.toLowerCase(a);
        
        System.out.println(a+" ~ "+b);

	}

}
