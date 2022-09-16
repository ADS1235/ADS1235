
public class StudentGrade {
	 void Studentgrade1(double m1,double m2,double m3,double m4,double m5) { 
				   
			     	  double per;
				     per = (m1+m2+m3+m4+m5)/5.0;
				     System.out.println(per);
				   
				     if (per>=75)
					 System.out.println("Distinction");
				     else if (per<75 && per>=60) 
				     {
					 System.out.println("First Division");
				      } 
				     else if (per<60 && per>=45) 
				     {
					 System.out.println("Second Division");
				     }
				     else if (per<45 && per>=35)
				     {
					 System.out.println("Third Division");
				     }
				     else if (per<35) 
				     {			    
					 System.out.println("Unsuccessful");
					 }
				     }
	 
	 
				   public static void main(String[] args) {
					   StudentGrade SG = new StudentGrade();
					   SG.Studentgrade1(78, 76, 77, 98, 88);
				   }
				   }
				




