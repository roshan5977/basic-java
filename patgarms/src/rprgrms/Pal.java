package rprgrms;

import java.util.Scanner;

public class Pal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out
					.println("CHOOSE WHAT U WANT THE FIND THE PALINDROME OF :::-  \n" + "1.number  \n" + "2.words \n");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("ENTER  THE NUM I WANNAAA FIND PALINDROME");
				int num = sc.nextInt();
				int count = counting(num, 0) / 10;
				System.out.println(pal(num, count));
				break;
			case 2:
				System.out.println("ENTER  THE WORD I WANNAAA FIND PALINDROME");
				String s = sc.next();
				s = s.toLowerCase();
				System.out.println(stringPal(s, -1, ""));
				break;
			default:
				System.out.println("enter valid input");
				break;
			}
			System.out.println("do u want to continue y or n ");
			String d = sc.next();
			System.out.println(
					"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			if (d.charAt(0) == 'y' || d.charAt(0) == 'Y')
				continue;
			else
				return;
		}
	}

	public static String stringPal(String s, int i, String s2) {
		if (i == s.length() - 1) {
			return s2 += "";
		}
		return s2 += stringPal(s, ++i, s2) + s.charAt(i);
	}

	public static int counting(int tem, int count) {
		if (tem <= 0) {
			// System.out.println(count);
			return 1;
		}
		// in recursion one dout if count++ then count is always 0;
		return counting(tem /= 10, ++count) * 10;
	}

	public static int pal(int num, int count) {
		if (count == 1) {
			return num;
		}
		return ((num % 10) * count) + pal(num /= 10, count /= 10);
	}
}
