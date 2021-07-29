package eg1;
import java.util.*;
public class LicenseValidate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(a.matches("[0-9]{3}[/][0-9]{4}[A-Z]{2}"));
	}

}
//279/1991OD