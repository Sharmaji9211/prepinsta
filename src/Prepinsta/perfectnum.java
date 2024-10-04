package Prepinsta;
import java.util.Scanner;
public class perfectnum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num= sc.nextInt();
		int numcopy =num;
		int sum =0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==numcopy) {
			System.out.println("Perfect Num");
		}
		else {
			System.out.println("Not a Perfect Num");
		}
	}

}
