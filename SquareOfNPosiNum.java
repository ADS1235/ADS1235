import java.util.Scanner;
public class SquareOfNPosiNum {
public static void main(String[] args) {			
			int n,i,sum=0; 		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range : - ");
			n=sc.nextInt();
			
			i=1;
			while(i<=n) {
				
				int c=i*i;
				if(i<n)
				System.out.print(c+" + ");
				else
				System.out.print(c);
				
				sum=sum+c;
				i++;
				
			}
			
			System.out.println("\n\nSum = "+sum);
			    
			  
		}
	}




