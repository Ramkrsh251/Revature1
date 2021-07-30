package day5;
import java.util.*;
public class Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		StringBuilder sb=new StringBuilder("");
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++) {
			String tar=b[i];
			if(tar.length()%2==0) {
				sb.append(Character.toUpperCase(tar.charAt(0)));
				sb.append(tar.substring(1, tar.length()));
			}
			else {
				sb.append(tar.substring(0, tar.length()/2));
				sb.append(Character.toUpperCase(tar.charAt(tar.length()/2)));
				sb.append(tar.substring(tar.length()/2+1,tar.length()));
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
