package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt(); 
		int flag=0;
		Arrays.sort(ar); //Sorted the array
		//System.out.println(k);
		//System.out.println(Arrays.toString(ar));
		for(int i=0;i<k;i++) {
			if(ar[i]==ar[i+1]) {//if there is any duplicate increment k
				flag++;
			//	System.out.print("YEs");
			}
		}
		//System.out.println(k);
		System.out.print(ar[k+flag-1]);//print  the k value
	}
}
//1 1 1 1 2 3 4 4 5 5 5
/*1)Find Nth  max in array, remember it will have duplicates
 * 2)Take an array and remove all duplicates in it
 * 3)Find all the palindrome numbers in array
 * 4)Find all prime numbers in array
 * 5)Take array as input remove the digits where the first value and last value is same
 * eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
 * so output will be [344,699]
*/