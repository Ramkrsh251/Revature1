package week2;
@FunctionalInterface
public interface Lambdaeg {
	void hello();
	default void iamDefault() {
		System.out.println("Default");
	}
	public static int iamStatic() {
		System.out.println("Static");
	}
}
