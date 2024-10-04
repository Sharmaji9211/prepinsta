package Prepinsta;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number1 ");
		int num1= sc.nextInt();
		System.out.println("enter the number2 ");
		int num2= sc.nextInt();
		int lcm=0;
		int max= (num1>num2)?num1:num2;
		int i;
        for( i=max;i<=num1*num2;i++) {
        	if(i%num1==0&&i%num2==0) {
        		lcm=i;
        		break;
        	}
        }
        System.out.println(lcm);

	}

}
