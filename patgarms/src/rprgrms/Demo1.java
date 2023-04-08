package rprgrms;

public class Demo1 {

	public static void main(String[] args) {
		int n=5;
		m1(n);
	}
	public static void m1(int n) {
		if (n==20) {
			return;
		}
		System.out.println(n);
		m1(n+1);
		System.out.println(n);
	}
}
