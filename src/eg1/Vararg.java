package eg1;

public class Vararg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo("anxja","cadb","caj","ac");
}
	public static void demo(String ...d){
	for(String i:d) {
		System.out.println(i);
	}
}
}