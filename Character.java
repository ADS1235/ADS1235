import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		System.out.println("Enter any character");
		char a;
		Scanner sc = new Scanner(System.in);
		a=sc.next().charAt(0);
		if (a>='A' && a<='Z')
			System.out.println(a+ "is the uppercase ");
		if (a>='a' && a<='z')
		    System.out.println(a+ "is the lowercase ");
		if (a>='0' && a<='9')
			System.out.println(a+ "is the digit ");
	
		
		
}}
