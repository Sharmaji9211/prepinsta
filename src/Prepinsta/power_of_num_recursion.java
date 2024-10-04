package Prepinsta;
import java.util.Scanner;
public class power_of_num_recursion {
	int power(int base,int pow) {
		if(base==0) {
			return 1;
		}
		return (base*power(base,pow-1));
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.print("enter the number ");
			int num= sc.nextInt();
			power_of_num_recursion pr=new power_of_num_recursion();
			System.out.println(pr.power(num, 3));
		}
		
	}


