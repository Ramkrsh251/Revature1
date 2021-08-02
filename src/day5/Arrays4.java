package day5;

import java.util.Scanner;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find prime numbers
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int t=a[i];
			int flag=0;
			for(int j=2;j<t;j++) {
				if(t%j==0) {
					continue;
				}
				else {
					flag++;
				}
			}
			if(flag==t-2) {
				System.out.println(t);
			}
		}
	}

}
