package Prepinsta;

import java.util.Scanner;

public class rangeAmstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number range ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			int k = i;
			int sum=0;
			int rem;
		while(k>0) {
			rem=k%10;
			sum = sum+(rem*rem*rem);
			k=k/10;
		}
		if(sum == i)
		System.out.println("This is Amstrong= "+i);	
		}
	}

}
