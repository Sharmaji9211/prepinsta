package Prepinsta;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter te Range");
		int n= sc.nextInt();
		int a=0,b=1;
		System.out.print(a+","+b+",");
		int Nexttrem = 0;
		for(int i=2;i<n;i++) {
			Nexttrem= a+b;
			a=b;
			b=Nexttrem;
			System.out.print(Nexttrem +",");
		}
	

	}

}
