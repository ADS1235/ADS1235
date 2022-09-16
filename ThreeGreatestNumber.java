import java.util.Scanner;
class ThreeGreatestNumber{
public static void main (String[] arga){

int a,b,c;
System.out.println("Enter any 3 number");
Scanner sc =new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a>b && a>c)
System.out.println(a+  "Greatest number");
else
if(b>c)
System.out.println(b+  "Greatest number");
else
System.out.println(c+  "Greatest number");

}}