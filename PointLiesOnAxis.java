
public class PointLiesOnAxis {

void Qudarantequ(int x, int y) {
					   
			   if       (x>0&& y>0) {
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
			   else if (x!=0 && y==0){
					   System.out.println("Point lies on X-axis");
			   } 
			   else if (x==0 && y!=0){
					   System.out.println("Point lies on Y-axis");
			   }
			   else if (x==0 && y==0){
				   
			   }
			   }
			 
			
			  public static void main(String[] args) {
			PointLiesOnAxis PLOA =new  PointLiesOnAxis();
				PLOA.Qudarantequ(0, 9);
				
			   }

		}





