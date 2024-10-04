package Prepinsta;
			import java.util.Scanner;
			public class sum_of_two_prime_num {	
				public static void main(String[] args) {
					Scanner sc= new Scanner(System.in);
					System.out.println("enter the num =");
					int number= sc.nextInt(); 
					int x=0;
					for(int i=2;i<number/2;i++) {
						 if(sum_of_prime(i)) {
							 if(sum_of_prime(number-i)) {
								 System.out.println(number+"="+i+"+"+(number-i)+"");
								 x=1;
							 }
						 }
					}
					if(x==0) {
						System.out.println("Can not be expressed ");
					}
				}
				public static boolean sum_of_prime(int i) {
					if(i==0||i==1) {
						return false;
					}
					else {
						for(int j=2;j<=Math.sqrt(i);j++) {
							if(i%j==0) {
								return false;
							}
						}
				
				return true;		
		}  
	}
}
	

