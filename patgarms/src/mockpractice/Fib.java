package mockpractice;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		System.out.println("ENETR THE NUM HOW MANY FIB NUM U WANT");
		int n = new Scanner(System.in).nextInt(), c;
		for (int i = 1, a = 0, b = 1; i <= n; c = a + b, a = b, b = c, i++)
			System.out.print(a + " ");
	}

}
