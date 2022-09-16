import java.util.Scanner;
public class NFactorialNumber {
	
	public static void main(String[] args) {
		int i,n,fact=1;
		
		System.out.println("Enter any number");
	    Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
	    i=1;
	    while(i<=n) {
		fact=fact*i;
		i++;
		 }
	    System.out.println("Factorial of "  +n  +"  = " +fact);
	     }
	}


