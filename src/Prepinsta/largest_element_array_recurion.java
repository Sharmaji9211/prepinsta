package Prepinsta;
public class largest_element_array_recurion {
	static int array[]= {10,20,40,50,21,80,45};
	static int largest() {
		int i;
		int max =array[0];
		for( i=0;i<=array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Largest num is "+largest());
	}
}
