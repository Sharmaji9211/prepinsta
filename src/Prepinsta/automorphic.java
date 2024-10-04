package Prepinsta;

import java.util.Scanner;

public class automorphic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num= sc.nextInt();
		int square=num*num;
		if(square%10==num%10) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("Not Automorphic");
		}
	}

}
