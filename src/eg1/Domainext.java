package eg1;
import java.io.*;

public class Domainext {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		String a=br.readLine();		
		int beg=(a.indexOf("//"));
		int end=a.indexOf('/', beg+2);
		System.out.println(a.substring(beg+2,end));
	}
}