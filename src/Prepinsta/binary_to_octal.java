package Prepinsta;
import java.util.Scanner;
public class binary_to_octal {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("enter the binary number =");
			int num= sc.nextInt();
			int decimal = 0;
			int n=0;
			while(num>0) {
				int rem =num%10;
				decimal=(int)(decimal+(rem*Math.pow(2, n)));
				num=num/10;
				n++;
			}
	        System.out.println("decimal=" +decimal);
	        int octal[]=new int [32];
	        int i=0;
	        while(decimal>0) {
	        	int rem=decimal%8;
	        	octal[i++]=rem;
	        	decimal=decimal/8;
	        }
	        for(int j=i-1;j>=0;j--) {
	        	 System.out.print(octal[j]+"");
	        }
		}
	}


