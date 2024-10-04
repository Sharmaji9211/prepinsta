package Prepinsta;
import java.util.Scanner;
public class strong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num= sc.nextInt();
		int numcopy=num;
		int sum=0;
		
	    while(num!=0) {
	    	int rem=num%10;
	    	int fact=1;
	    	for(int i=1;i<=rem;i++) {
	    		fact=fact*i;
	    	}
	    	sum=sum+fact;
	    	num=num/10;
	    }
	    if(sum==numcopy) {
		System.out.println("Strong");
	    }
	    else {
	    	System.out.println("NOt Strong");
	    }
    sc.close();
	}

}
