package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		int ar2[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		ar2[0]=ar[0];
		int j=0;
		for(int i=1;i<n;i++) {
			if(Arrays.binarySearch(ar2,ar[i])>-1) {
				continue;
			}
			else {
				ar2[j++]=ar[i];
			}
		}
		System.out.println(Arrays.toString(ar2));
	}

}
/* * 2)Take an array and remove all duplicates in it
 * ar1=4 4 5 6 7
 * ar2=4 5
 * */