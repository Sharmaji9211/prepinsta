package Prepinsta;

import java.util.Scanner;

public class convert_digit_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the integer number ");
		int num= sc.nextInt();
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		while(rev>0) {
		switch(rev%10) {
		case 1: { System.out.print("one");
			     rev=rev/10;
			     break;
		         }
		case 2: { System.out.print("Two");
				rev=rev/10;
				break;
        }
		case 3: { System.out.print("Three");
						rev=rev/10;
					     break;
        }
		case 4: { System.out.print("four");
		rev=rev/10;
			     break;
        }
		case 5: { System.out.print("Five");
		rev=rev/10;
			     break;
        }
		case 6: { System.out.print("Six");
		rev=rev/10;
			     break;
        }
		case 8: { System.out.print("Eight");
		rev=rev/10;
			     break;
        }
		case 9: { System.out.print("nine");
		rev=rev/10;
	           break;
        }
		default :{ System.out.println("Enter only integer number");
		break;
		}
	}

}
	}
	}
