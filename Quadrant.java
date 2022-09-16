import java.util.Scanner;

public class Quadrant {


	public static void main(String[] args) {
	  
		  int x,y;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the co-ordinates of the point ");
		   x=sc.nextInt();
		   y=sc.nextInt();
		    		   
		   if (x>0&& y>0) {
				   System.out.println("Point lies in the first quadrant");
		   } 
		   else if (x<0 && y>0) {
				   System.out.println("Point lies in the second quadrant");
		   }
		   else if (x<0 && y<0) {
				   System.out.println("Point lies in the Third quadrant");
		   } 
		   else if (x>0 && y<0) {
				   System.out.println("Point lies in the fourth quadrant");
		   }
		   else if (x!=0 && y==0) {
				   System.out.println("Point lies on X-axis");
		   } 
		   else if (x==0 && y!=0) {
				   System.out.println("Point lies on Y-axis");
		   }
		   else if (x==0 && y==0) {
				   System.out.println("Point is Origin");}
		   }
     }
		


