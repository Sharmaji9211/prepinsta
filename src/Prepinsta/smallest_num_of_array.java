package Prepinsta;

public class smallest_num_of_array {
		static int array[]= {10,20,40,50,5};
		static int smallest() {
			int min =array[0];
			for(int i=0;i<=array.length;i++) {
				if(min<array[i]) {
					min=array[i];
				}
			}
			return min;
		}
		public static void main(String[] args) {
			System.out.println("Largest num is "+smallest());
		}
	}



