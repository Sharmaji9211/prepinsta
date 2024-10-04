package Prepinsta;
import java.util.Scanner;
import java.util.*;
public class prepinsta {
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr a number ");
		int num= sc.nextInt();
		if(num>=0) {
			if(num ==0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("Postive");
			}
		}
		else {
			System.out.print("Negative");
		}
	}
}
