package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of total trains arriving");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		int plat[]=new int[24];
		System.out.println("Provide Arrival timings");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("Provide Departure timings");
		for(int j=0;j<n;j++) {
			dep[j]=sc.nextInt();
		}
		int platform=1;
		for(int i=0;i<n;i++) {
			for(int j=arr[i];j<=dep[i];j++) {
				plat[j]+=1;
			}
		}
	//	System.out.println(Arrays.toString(plat));
		Arrays.sort(plat);
		System.out.println("No. of platforms required are :"+plat[23]);
	}
}
/*You are given arrival and departure time 
 * of trains reaching to a particular station. 
 * You need to find minimum number of platforms 
 * required to accommodate the trains at any point of time.*/