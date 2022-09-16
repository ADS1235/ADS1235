import java.util.Scanner;

public class RemainderOfDivide{

	public static void main(String[] args) {
		System.out.println("Enter any two number");
		double n1,n2,rem;
		Scanner sc = new Scanner(System.in);
	 n1=sc.nextDouble();
	 n2=sc.nextDouble();
	 rem = (n1%n2);
	 System.out.println("Remainder of "+n1+" Divide by "+n2+"  = "+rem);
}

}
