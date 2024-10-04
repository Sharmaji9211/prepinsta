package Prepinsta;

import java.util.Scanner;

public class decimal_to_octal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number decimal =");
		int num= sc.nextInt();
		int octal[] =new int[32];
		int i =0;
		while(num>0) {
			int rem= num%8;
			octal[i++]=rem;
			num=num/8;
		}
		System.out.print("octal = ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(octal[j]+"");
		}
	}
}
