package Prepinsta;
import java.util.Scanner;
public class prime_num1_to100 {

	 public static void main(String []agrs) {
		 Scanner sc= new Scanner(System.in);
			System.out.print("Enter the Range ");
			int n= sc.nextInt();
			for(int i=2;i<=n;i++) {
				int flag =0;
			         for(int j=2;j<i;j++) {
			        	 if(i%j==0) {
			        		 flag=1;
			        	 }
				}
			         if(flag==0) {
			        	 System.out.println(i);
			         }
			}
	 }
}
