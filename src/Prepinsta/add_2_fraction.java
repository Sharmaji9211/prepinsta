package Prepinsta;
import java.util.Scanner;
public class add_2_fraction {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of first fractions ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		System.out.println("enter the value of second fractions ");
		int n3= sc.nextInt();
		int n4= sc.nextInt();
		int numerator,denumerator,i, gcd=0;
		numerator= (n1*n4)+(n2*n3);
		denumerator=(n2*n4);
		for( i=1;i<=numerator&&i<=denumerator;i++) {
			if(numerator%i==0&&denumerator%i==0) {
				gcd=i;
			}
		}	
		
		int ans1= (numerator/gcd);
		int ans2= (denumerator/gcd);
		System.out.println("Answer ="+ans1+"/"+ans2);

	}

}
