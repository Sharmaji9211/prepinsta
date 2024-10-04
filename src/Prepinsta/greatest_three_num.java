package Prepinsta;
import java.util.Scanner;
public class greatest_three_num {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first num ");
		int A= sc.nextInt();
		System.out.println("Enter the Second num ");
		int B= sc.nextInt();
		System.out.println("Enter the Third num ");
		int C= sc.nextInt();
		if(A>B && A>C) {
			System.out.println("First is Greatest ");
		}
		else if(B>A && B>C) {
			System.out.println("Second is Greatest ");
		}
		else {
			System.out.println("Third is Greatest ");
		}
	}

}
