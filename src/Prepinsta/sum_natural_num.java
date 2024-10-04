package Prepinsta;
import java.util.Scanner;
public class sum_natural_num {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range ");
		int range= sc.nextInt();
		int sum=0;
		for(int i=1;i<=range;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of N natural Number= " +sum);
		
		
	}
}
