package mockpractice;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int g = a > b ? a : b, s = a < b ? a : b, lcm = 0;
		for (int i = 1; i <= g; i++) {
			lcm = i * g;
			if (lcm % s == 0)
				break;
		}
		System.out.println(lcm);
		scan.close();

	}

}
