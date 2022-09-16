import java.util.Scanner;

public class TempDegreeToFar {

	public static void main(String[] args) {
		
		System.out.println("Enter the temp in degree celcius into far");
		Scanner sc =new Scanner(System.in);
		double c,far;
		 c=sc.nextDouble();	
		 far= 9.0/5*c+32;
		 System.out.println("celcius =" +c+"Fahrenheit" +far);

	}

}
