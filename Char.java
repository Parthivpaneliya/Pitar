import java.util.*;
public class Char
{
	public static void main(String[] args) {

		String a;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string:");
		a=sc.nextLine();

		System.out.println("String length is:" +a.length());
		System.out.println("second half of String is:");
		System.out.println(a.substring(a.length()/2));
	}	
}