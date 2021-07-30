package eg1;
import java.util.Arrays;
import java.lang.*;
public class ArrayDemo {

	public static void main(String[] args) {
	int ar[]= {1,2,3,4,5,6};
	for(int i:ar) {
		System.out.println(i);
	}
	System.out.println("");
	System.out.println(Arrays.toString(ar));
	System.out.println(Arrays.binarySearch(ar,5));
	System.out.println(Arrays.binarySearch(ar,0));
	int ar2[]=Arrays.copyOf(ar,ar.length+5);
	System.out.println(Arrays.toString(ar2));
	Arrays.fill(ar2,5);
	System.out.println(Arrays.toString(ar2));
	}

}