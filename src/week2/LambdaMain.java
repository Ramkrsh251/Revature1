package week2;

public class LambdaMain{
	public static void main(String[] args) {
		Lambdaeg lm=()->System.out.println("Hello Iam lambda");
		lm.hello();
		Lambdaeg lm2=()->{
			System.out.println("lm2 Hello");
			System.out.println("lm2 again ");
		};
		lm2.hello();
		lm2.iamDefault();
		lm2.iamStatic();
	}
	public static int add(int i,int j) {
		return i+j;
	}
	//(i,j)->i+j
}
//