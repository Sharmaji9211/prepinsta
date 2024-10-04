package Prepinsta;
import java.util.Scanner;
public class maximum_handshake {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of persons ");
		int n= sc.nextInt();
		int max= (n*(n-1))/2;
		System.out.println("Mximum number of Hanshake= "+max);
	}

}
