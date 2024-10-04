package Prepinsta;

import java.util.Scanner;

public class prime_recursion {
	
	 static boolean prime(int num, int i ){
		  if(num<=2) {
			  return (num==2)?true:false;
		  }
		  if(num%i==0) {
			  return false;
		  }
		  if(i*i>num) {
			  return true;
		  }
		  return prime(num,i+1);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number =");
		int num= sc.nextInt();
		 
		if (prime(num,2)) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
		

	}

}
