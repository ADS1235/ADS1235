import java.util.Scanner;

public class AreaSUrAreaVolumeOfSphere {

	public static void main(String[] args) {
	double l,r,h;
	double vol,area,sur;
	System.out.println("Enter the length");
	
	Scanner sc =new Scanner (System.in);
	l=sc.nextDouble();
	System.out.println("Enter the radius");
	r=sc.nextDouble();
	System.out.println("Enter the height");
	h=sc.nextDouble();
	vol=Math.PI*r*r*h/3;
	area=Math.PI*r*(l+h);
	sur=Math.PI*r*l;
	System.out.println("volume of sphere ="+vol);
		
	System.out.println("area of sphere ="+area);
	System.out.println("surface area of sphere ="+sur);
	
	}
}
