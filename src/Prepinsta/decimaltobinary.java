package Prepinsta;
import java.util.Scanner;
public class decimaltobinary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number =");
		int num= sc.nextInt();
		int binary[] =new int[32];
		int i =0;
		while(num>0) {
			int rem= num%2;
			binary[i++]=rem;
			num=num/2;
		}
		System.out.print("Binary = ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]+"");
		}
	}

}
