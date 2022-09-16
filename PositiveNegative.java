import java.util.Scanner;
public class PositiveNegative {
public static void main (String [] args){
		 
       int n;
       System.out.println("Enter any number");
       Scanner sc = new Scanner (System.in);
   	   n=sc.nextInt();
	 
		if (n>0){
		System.out.println("Positive number");
		}
		else
		
		if (n<0) {
		System.out.println("Negative number");
		}
		else
			System.out.println("zero is zero");
	
}}
