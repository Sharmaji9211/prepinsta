package Prepinsta;
import java.util.Scanner;
public class powerofnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number and its power");
		int num= sc.nextInt();
		int power= sc.nextInt();
		int result =1;
		while(power!=0){
			result =result*num;
			power--;
		}
		System.out.println(result);
	}

}
