package mockpractice;
import java.util.Scanner;
public class PrimeSum10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(), count = 0, sum = 0;
		for (int i = a; i <= b; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				if (count <= 10) sum += i;
			}
		}
		System.out.println("sum of first 10 prime is " + sum);
	}
}
