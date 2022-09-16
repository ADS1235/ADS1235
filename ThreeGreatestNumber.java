import java.util.Scanner;

public class ThreeGreatestNumber {

	public static void main(String[] args) {
		
     System.out.println("Enter any 3 number");
     Scanner sc =new Scanner (System.in);
      
     double a,b,c;
      a=sc.nextDouble();
		
      b=sc.nextDouble();
		
      c=sc.nextDouble();
			
 
     if (a>b && a>c )
     {
	      
		  System.out.println(a+ "greatest");
     }
          else
         
	      if(b>c)
		  System.out.println(b+ "greatest");
	      else
	      System.out.println(c+ "greatest");
     
    
	}
}

