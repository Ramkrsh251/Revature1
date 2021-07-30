package day5;
import java.util.Scanner;
public class Upper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		StringBuffer sb=new StringBuffer("");
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++) {
			String tar=b[i];
			sb=sb.append(tar.substring(0,tar.length()-1));
			sb=sb.append(Character.toUpperCase(tar.charAt(tar.length()-1)));
			sb=sb.append(" ");
		}
		System.out.print(sb);
	}

}
