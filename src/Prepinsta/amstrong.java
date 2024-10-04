package Prepinsta;
import java.util.Scanner;
public class amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int numCopy=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev+rem*rem*rem;
			num=num/10;
		}
		if(rev==numCopy)
		System.out.println("This is Amstrong");	
		else {
			System.out.println("This is not Amstrong");	
	         }
	}
}
