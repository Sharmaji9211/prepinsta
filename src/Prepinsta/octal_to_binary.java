package Prepinsta;
import java.util.Scanner;
public class octal_to_binary {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("enter the octal number =");
			int num= sc.nextInt();
			int decimal = 0;
			int n=0;
			while(num>0) {
				int rem =num%10;
				decimal=(int)(decimal+(rem*Math.pow(8, n)));
				num=num/10;
				n++;
			}
	        System.out.println("decimal=" +decimal);  
	        int binary[]= new int [32];
	        int i=0;
	        while(decimal>0) {
	        	int rem1=decimal%2;
	        	binary[i++]=rem1;
	        	decimal=decimal/2;
	        }
	        for(int j=i-1;j>0;j--)
	        System.out.print(binary[j]+"");  
		}
	}
