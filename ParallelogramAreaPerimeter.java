import java.util.Scanner;

public class ParallelogramAreaPerimeter {

	public static void main(String[] args) {
		double base,height;
		double area,perimeter;
		System.out.println("Enter base of Parallelogram ");
		Scanner sc =new Scanner  (System.in);
	   	base=sc.nextDouble();
	    System.out.println("Enter height of Parallelogram ");
	    height=sc.nextDouble();
	  
	   area=(base*height);
	  
		perimeter=2*(base+height);
		 System.out.println("area of Parallelogram ="  +area);
		 System.out.println("perimeter of Parallelogram ="  +perimeter);

	
	
	
	
	
	}
}