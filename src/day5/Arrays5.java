package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
	}
		int k=0;
		for(int j=0;j<n;j++) {
			String tar=a[j]+"";
			if(tar.charAt(0)==tar.charAt(tar.length()-1)) {
				continue;
			}
			else {
				b[k++]=a[j];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
