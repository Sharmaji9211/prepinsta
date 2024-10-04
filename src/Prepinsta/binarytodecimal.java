package Prepinsta;
import java.util.Scanner;
public class binarytodecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number =");
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
        
	}

}
