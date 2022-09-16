
public class ConvertKmMCmMm1 {
 void conevert(double km) {
			double m,cm,mm;
				
		   	m=1000*km;
			cm=100000*km;
			mm=1000000*km;
			
		System.out.println(" distance in kilometer= " + km);
		
		System.out.println(" distance in meter= " + m);

		System.out.println(" distance in centimeter= " + cm);
		
		System.out.println(" distance in millimeter= " + mm);	 
	                      }
	  
	  public static void main(String[] args) {
		  ConvertKmMCmMm1 C = new ConvertKmMCmMm1();
		                  C.conevert(3);
		  
	  }}




