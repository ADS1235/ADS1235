import java.util.Scanner;

    public class InterchanceTwoVariable {

	public static void main(String[] args) {
		
		 System.out.println("Enter any 2 number");
		 Scanner sc = new Scanner(System.in);
		 int a,b,t;
		 a=sc.nextInt();
		 b=sc.nextInt();
		
	    System.out.println("before swapping a = "+a+ "b= "+b);
        t=a;
        a=b;
        b=t;

        System.out.println("after swapping a = "+a+ "b= "+b);
        }
      }

