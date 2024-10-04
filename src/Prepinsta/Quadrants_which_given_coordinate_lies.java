package Prepinsta;
import java.util.Scanner;
public class Quadrants_which_given_coordinate_lies {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of X AND y =");
		int x= sc.nextInt();
		int y= sc.nextInt();
		if(x>0&&y>0) {
			System.out.print("" +x+ " and " +y+ " lies in first Quadrants");
		}
		else if(x<0&&y>0) {
			System.out.print("" +x+ " and " +y+ " lies in second Quadrants");
		}
		else if(x<0&&y<0) {
			System.out.print("" +x+ " and " +y+ "  lies in third Quadrants");
		}
		else if(x>0&&y<0) {
			System.out.print("" +x+ " and " +y+ " lies in fourth Quadrants");
		}
		 else if (x == 0 && y == 0)
	            System.out.println("Origin");
	            
	        //On x-axis
	        else if (y==0 && x!=0)
	            System.out.println("x-axis");
	            
	        //On y-axis
	        else if (x==0 && y!=0)
	            System.out.println("y-axis");
	}

}
