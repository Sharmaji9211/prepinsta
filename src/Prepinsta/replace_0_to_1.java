package Prepinsta;
import java.util.Scanner;
public class replace_0_to_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the integer number ");
		int n= sc.nextInt();
		int sum=0,k=1;
		int num2=0;
		while(n>0) {
			int rem=n%10;
			if(rem==0) {
				rem=1;
			}
			
			num2=num2+rem*k;
			   n=n/10;
			   k=k*10;
		}
		System.out.println(num2);
		   
		}
	}


