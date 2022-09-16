import java.util.Scanner;

public class AreaOfSquare {
	public static void main (String [] args) {
		 double side,area;
	     Scanner s = new Scanner(System.in);
	     System.out.print(" enter any side ");
	     side =s.nextDouble();
	     
	     area = side*side;
	     System.out.println("Area of Square ="+area);

}}
