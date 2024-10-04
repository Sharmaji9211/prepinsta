package Prepinsta;
import java.util.*;
public class length_of_string {
	
    static int length(String str){
    	
    	if(str=="") {
    		return 0;
    	}
    	else 
    	return length(str.substring(1))+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string ");
      String str= sc.nextLine();
      System.out.println("length is "+length(str));
	}

}
