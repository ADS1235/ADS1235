import java.util.Scanner;

public class SeriesOfNPositive {

	public static void main(String[] args) {
		int n,i; 
		System.out.println("Enter the range ");
		Scanner sc =new Scanner (System.in);
		n=sc.nextInt();
	
		i=1;
		while(i<=n) {
			if(i<n) {
				System.out.print(i+  "+");}
				else
					System.out.println(i);
				i++;
			}
		}}
