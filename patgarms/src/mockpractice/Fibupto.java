package mockpractice;

import java.util.Scanner;

public class Fibupto {

	public static void main(String[] args) {
		System.out.println("ENTER THE NUM UPTO WHICH U WANT FIB");
		int n = new Scanner(System.in).nextInt(), c;
		for (int a = 0, b = 1; a <= n; c = a + b, a = b, b = c)
			System.out.println(a);
	}
}
