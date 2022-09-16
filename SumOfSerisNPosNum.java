import java.util.Scanner;

public class SumOfSerisNPosNum {

	public static void main(String[] args) {
		
		
			int n,i,sum=0; 
			System.out.println("Enter the range ");
			Scanner sc =new Scanner (System.in);
			n=sc.nextInt();
		
			i=1;
			while(i<=n) {
				sum=sum+i;
				if(i<n) {
					System.out.print(i+  "+");}
					else
						System.out.println(i);
					i++;
				}
			System.out.println("Sum =" +sum);
			}

	}


