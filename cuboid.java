import java.util.Scanner;

public class cuboid {

	public static void main(String[] args) {
		double area,volume,latesur;
		double length,height,width;
		 System.out.println("Enter the length");
		Scanner sc =new Scanner (System.in);
		
		 length=sc.nextDouble();
		 System.out.println("Enter the height");
	     height=sc.nextDouble();
	     System.out.println("Enter the width");
	     width=sc.nextDouble();
	    
	     area=2*(length*width+height*width+height*length);
	     latesur=2*height*(length+width);
	     volume=length*height*width;
	    
	     System.out.println("area of cuboid ="   +area);
	     System.out.println("latesur of cuboid ="   +latesur);
	     System.out.println("volume of cuboid ="   +volume);
	     
	
}

}
