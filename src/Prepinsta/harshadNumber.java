package Prepinsta;
import java.util.Scanner;
public class harshadNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num= sc.nextInt();
		int numcopy=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(numcopy%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}

	}

}
