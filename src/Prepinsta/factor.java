package Prepinsta;
import java.util.Scanner;
public class factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		getfactor(num);
	}
	static void getfactor(int num) {
       for(int i =1;i<=(num/2);i++) {
    	   if(num%i==0) {
    		   System.out.println(i);
    	   }
       }
       System.out.println(num);
	}

}
