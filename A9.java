//JK Surya
//20450372

public class A9{

	public static void main(String[] args) {
		
		String g=args[0];
		int age=Integer.parseInt(args[1]);

		if(g.equals("Female")) {
		   if(age>=1 && age<=58)
		        System.out.println("Interest :8.2%");
		   else if(age>58 &&a ge<=120)
			    System.out.println("Interest :7.6%");
		   else
				System.out.println("No result");
		}
		
		else {
		       if(age>=1 && age<=58)
			      System.out.println("Interest :9.2%");
		       else if(age>58 && age<=100)
			       System.out.println("Interest :8.3%");
			   else 
				   System.out.println("No result");
		}

	}

}
