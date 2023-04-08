package mockpractice;

import java.util.Scanner;

public class FibRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUM");
		int s = scan.nextInt();
		System.out.println("ENTER THE LAST NUM");
		int l = scan.nextInt(), c;
		for (int a = 0, b = 1; a <= l; c = a + b, a = b, b = c)
			if (a > s)
				System.out.println(a);
		scan.close();
	}

}
