import java.util.Scanner;
class LeapYearOrNot{
public static void main (String []args){
int year;
System.out.println("Enter any year");
Scanner sc =new Scanner (System.in);
year=sc.nextInt();
if(year%4==0)
System.out.println(year+  "Is a leap year");
else
System.out.println(year+  "Is  not leap year");

}}