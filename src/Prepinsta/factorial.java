package Prepinsta;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int fact =1;
		if(num<0) {
			System.out.println("please Enter the Correct Number");
		}
		else if(num==0&&num==1){
			System.out.println("fact=1");
		}
		else {
			for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
			System.out.println(fact);
		}
	}

}
