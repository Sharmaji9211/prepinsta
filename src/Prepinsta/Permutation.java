package Prepinsta;
import java.util.Scanner;
public class Permutation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of n ");
		int n= sc.nextInt();
		System.out.print("enter the value of r ");
		int r= sc.nextInt();
		int fact1=1;
		int fact2=1;
		if(n==0&&n==1){
			System.out.println(fact1==1);
		}
		else {
			for(int i=1;i<=n;i++) {
			fact1=fact1*i;
		     }
		}
		 if((n-r)==0&&(n-r)==1){
				System.out.println(fact2==1);
			}
			else {
				for(int i=1;i<=(n-r);i++) {
				fact2=fact2*i;
			     }
			}
			System.out.println(fact1/fact2);
	}

}
