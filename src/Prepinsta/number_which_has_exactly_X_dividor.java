package Prepinsta;
import java.util.Scanner;
public class number_which_has_exactly_X_dividor {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number =");
		int num= sc.nextInt();
		int count=0;
		for(int i=0;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
