package Prepinsta;
import java.io.*;
import static java.lang.Math.*;
import java.util.Scanner;

public class roots_of_quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the cofficients of x2 =");
		int a= sc.nextInt();
		System.out.print("enter the cofficients of x =");
		int b= sc.nextInt();
		System.out.print("enter the constant =");
		int c= sc.nextInt();
        int determinant= (b*b)-(4*a*c);
        double sqrt_val=sqrt(abs(determinant));
        if(determinant>0) {
        	System.out.println("Roots are real and differents");
          System.out.println((double)(-b+sqrt_val)/(2*a)+"\n"+(double)(-b-sqrt_val)/(2*a) );
        }
        else if(determinant==0) {
        	System.out.println("Roots are real and same");
            System.out.println(-(double)b/(2*a)+"\n"+ -(double)b/(2*a) );
          }
        else {
        	System.out.println("Roots are complex");
            System.out.println(-(double)b/(2*a)+" + i"+sqrt_val+"\n"+ -(double)b/(2*a)+" - i "+sqrt_val );
          }

	}



}
