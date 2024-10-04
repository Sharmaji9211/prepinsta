package Prepinsta;
import java.util.Scanner;
public class primefactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
	}
	static void getprime(int m) {	
		int count=0;
		for(int  i=2;i<=m;i++) {
    	        //for(int j=1;j<=i;j++) 
    	        	if(m%i==0) {
    	        		count++;
    	        		
    	        	}
	        	
    	        if(count==2) {
    	        	m=m/i;
    	        
	        		System.out.println(m);
                  }
    	     }
	       }
       }








