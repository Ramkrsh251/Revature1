package day5;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<b.length;i++) {
			StringBuilder sb2=new StringBuilder(b[i]);
			sb.append(sb2.reverse());
			sb.append(" ");
		}
		System.out.print(sb);
	}

}
