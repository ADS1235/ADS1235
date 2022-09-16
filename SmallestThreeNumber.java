import java.util.Scanner;
class SmallestThreeNumber{
public static void main(String[]args){
int a,b,c;
System.out.println("Enter any 3 number");
Scanner sc=  new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a<b && a<c)
System.out.println(a+  "is the Smallest number");
else

if(b<c)

System.out.println(b+  "is the Smallest number");
else

System.out.println(c+ "is the Smallest number");

}
}