package Prepinsta;
import java.util.Scanner;
public class reverse {
		public static void main(String[]agrs) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number ");
			int num = sc.nextInt();
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			System.out.println(sum);	
		}
	}


