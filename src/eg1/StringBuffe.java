package eg1;
import java.util.*;
public class StringBuffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer(sc.nextLine());
		System.out.println(sb1);
		//sb1.delete(0, 2);
		StringBuilder sb2=new StringBuilder(sc.nextLine());
		System.out.println(sb1.toString().equals(sb2.reverse().toString()));	
	}
}