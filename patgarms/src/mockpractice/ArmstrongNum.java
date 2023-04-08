package mockpractice;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first num");
		int a = sc.nextInt();
		System.out.println("enter the second num");
		int b = sc.nextInt();// 153
		for (int i = a; i <= b; i++) {
			int temp = i, tem = i, count = 0;
			for (; tem > 0; tem /= 10)
				count++;
			int sum = 0;
			for (; temp > 0; temp /= 10) {
				int prod = 1;
				for (int j = 1; j <= count; j++)
					prod *= (temp % 10);
				sum += prod;
			}
			if (sum == i)
				System.out.println(i);
		}
		sc.close();
	}

}
