

	import java.util.Scanner;

    
    public class ThreeSmallestNumber {

	    public static void main(String[] args) {
		
		System.out.println("Enter any 3 number");
		
		double a,b,c;
		Scanner sc =  new Scanner (System.in);
		a=sc.nextDouble();
		
		b=sc.nextDouble();
		
		c=sc.nextDouble();
		
		if(a<c)
		{
			if(a<c)
				System.out.println(a+ "Smallest");
			else System.out.println(c+ "Smallest");
	    }	
		else
		{	
			if(b<c)
				System.out.println(a+ "Smallest");
			else
				System.out.println(c+ "Smallest");
		}	
	
	}

}


