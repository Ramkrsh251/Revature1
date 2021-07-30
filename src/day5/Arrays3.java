package day5;
import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			StringBuilder sb=new StringBuilder(ar[i]+"");
		//	StringBuilder sb1=new StringBuilder(sb);
		
			if(sb.toString().equals(sb.reverse().toString())){
				System.out.println(sb);
			}
		}
	}
}
//sb1.toString().equals(sb2.reverse().toString()));	