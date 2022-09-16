import java.util.Scanner;
public class GrossSalary {
public static void main (String[]args){

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the basic Salary of empolyee");
		double bs; 
		double gs1,gs2,hra1,da1,hra2,da2; 
		bs=sc.nextDouble();
		hra1=bs*10/100;
		da1=bs*90/100;
		hra2=500;
		da2=bs*98/100;
		gs1=bs+hra1+da1;
		gs2=bs+hra2+da2;
		
		if(bs<1500)
			    System.out.println("gross salary   ="  +gs1);
			
		else
			if(bs>=1500)
				System.out.println("gross salary   ="  +gs2);
	}
	}




