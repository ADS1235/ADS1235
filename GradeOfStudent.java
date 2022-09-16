import java.util.Scanner;

public class GradeOfStudent {

	public static void main(String[] args) {
	double m1,m2,m3,m4,m5;
	double per;
	System.out.println(" mark of 5 student");
		Scanner sc = new Scanner(System.in);
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();			
		m4=sc.nextDouble();		
		m5=sc.nextDouble();
		
		   per = (m1+m2+m3+m4+m5)/5.0;
		    		   
		   System.out.println(per);
		   
		   if(per>=75)
		   System.out.println("Distinction");
		   
		   if(per<75) {
			   if(per>=60)
				   System.out.println("First Division");
		   }
		   
		   if(per<60) {
			   if(per>=45)
				   System.out.println("Second Division");
		   }
		   if(per<45) {
			   if(per>=35)
				   System.out.println("Third Division");
		   }
		   
		   if(per<35) {			    
				   System.out.println("Unsuccessful");
		   }
}}