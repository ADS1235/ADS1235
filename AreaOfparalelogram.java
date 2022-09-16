import java.util.Scanner;
public class AreaOfparalelogram {
	public static void main (String [] args) {
	 double base,height,area;
     Scanner s = new Scanner(System.in);
     System.out.print("enter the base =");
     base =s.nextDouble();
     System.out.print("enter the height =");
     height =s.nextDouble();
     area = base*height;
     System.out.println("Area of paralelogram ="+area);

}}