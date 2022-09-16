import java.util.Scanner;

public class ConvertKmMCmMm {

	public static void main(String[] args) {
	     	
		System.out.println("Enter the any distance");
		
		Scanner sc =new Scanner (System.in);
		
		double km,m,cm,mm;
		
		km=sc.nextDouble();
		
	   	m=1000*km;
		
		cm=100000*km;
		
		mm=1000000*km;
		
	System.out.println(" distance in kilometer= " + km);
	
	System.out.println(" distance in meter= " + m);

	System.out.println(" distance in centimeter= " + cm);
	
	System.out.println(" distance in millimeter= " + mm);	 
 }
  }


