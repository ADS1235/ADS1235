import java.util.Scanner;
class Character{
public static void main (String []args){

char x;
 System.out.println("Enter any Character");
Scanner sc =new Scanner (System.in);

x=sc.next().charAt(0);

if(x>='A' && x<='Z')
{

System.out.println(" Is a Uppercase");

}
else

if(x>='a' && x<='z')

System.out.println(" Is a lowercase");


else

if(x>='0' && x<='9')

System.out.println(" Is a digit");

else

System.out.println(" Is a Special characters");


}}