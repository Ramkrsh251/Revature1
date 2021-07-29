package eg1;
import java.io.*;

public class Websecurity {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		String a=br.readLine();		
		if(a.contains("https")) {
			System.out.println("Secured");
		}
		else {
			System.out.println("Not secured");
		}
	}
}