package Prepinsta;
import java.util.Scanner;
public class evenorodd {
		public static void main (String[]args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enetr a number ");
			int num= sc.nextInt();
			if(num%2==0) {
					System.out.println("Even");
				}
			else {
				System.out.print("Odd");
			}
		}
	}



