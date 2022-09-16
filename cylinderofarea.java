import java.util.Scanner;

public class cylinderofarea {

	public static void main(String[] args) {
		double radius,height;
		double area,volume,surfacearea,diameter;
		System.out.println("Enter the radius of cylinder");
		
		Scanner sc =new Scanner (System.in);
		radius=sc.nextDouble();
		System.out.println("Enter the height of cylinder");
		
		height=sc.nextDouble();
		diameter=2*radius;
		area=radius*(radius+height)*2*Math.PI;
        volume=radius*radius*height*Math.PI;
        surfacearea=2*Math.PI*radius*radius*height;
        System.out.println( "diameter of cylinder ="  +diameter);
        System.out.println( "area of cylinder ="  +area);
        System.out.println( "volume of cylinder  ="  +volume);
        System.out.println( "surface area of cylinder ="  +surfacearea);
	}

}
