package Prepinsta;

public class primeNum {
	public static void main(String[]args) {
		int num=23;
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.print("Not Prime");
		}
		else {
			System.out.print("Prime");
		}
	}

}
