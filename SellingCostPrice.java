
import java.util.Scanner;
public class SellingCostPrice {
public static void main(String[] args)
			{
				int sp,cp,ans;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Selling Price ");
				sp=sc.nextInt();
				System.out.println("Enter the Cost Price ");
				cp=sc.nextInt();
				if(sp>cp)
				{
					ans=sp-cp;
					System.out.println("Profit ="  +ans);
				}
				else if(sp<cp)
				{
					ans=cp-sp;
					System.out.println("Loss ="+ans);
				}
				else
					System.out.println("No profit or loss");
			}}
		





