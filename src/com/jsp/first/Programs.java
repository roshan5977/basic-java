package com.jsp.first;

import java.util.Iterator;
import java.util.Scanner;

public class Firstcode {
	public static void main(String[] args) {
		System.out.println("WELCOME TO DARK WEB CODING");
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER FIRST NUM");
		int a = s.nextInt();
		System.out.println("enetr second num");
		int b = s.nextInt();
		// System.out.println();

	}

	static void armstrong(int i) {
		if (isarmstrong(i))
			System.out.println("THE ENTER NUMBER IS AN Armtrong NUM");
		else
			System.out.println("THE ENTER NUMBER IS NOT AN Armtrong NUM");
	}

	static void prime(int i) {
		if (isprime(i))
			System.out.println("THE ENTER NUMBER IS A PRIME NUM");
		else
			System.out.println("THE ENTER NUMBER IS NOT PRIME NUM");
	}

	static void armstrongrange(int c, int d) {
		for (int i = c; i <= d; i++) {
			if (isarmstrong(i))
				System.out.println(i);
		}
	}

	static int len(int n) {
		int count = 0;
//        	   while(n>0)
//        	   {
//        		   count++;
//        		   n/=10;
//        	   }
		for (count = 0; n != 0; count++)
			n /= 10;
		return count;
	}

	static int pow(int base, int exp) {
		int prod = 1;
		for (int i = 1; i <= exp; i++) {
			prod *= base;
		}
		return prod;
	}

	static boolean isarmstrong(int k) {
		int temp = k;
		int l = len(k);
		int sum = 0;
		while (k > 0) {
			int hold = k % 10;
			sum += pow(hold, l);
			k /= 10;
		}
		k = temp;
		if (sum == k)
			return true;
		else
			return false;
	}

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	static boolean isprime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void primerange(int c, int d) {
		for (int i = c; i <= d; i++) {
			if (i < 2)
				continue;
			if (isprime(i))
				System.out.println(i);
		}
	}

	static void fib(int n) {
		int a = 0, b = 1, c;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

	static void fib_upto(int n) {
		int a = 0, b = 1, c;
		while (a < n) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

	static void fib_range(int g, int h) {
		int a = 0, b = 1, c;
		while (a < h) {
			if (a > g) {
				System.out.println(a);
			}
			c = a + b;
			a = b;
			b = c;
		}
	}

	static int gcd(int a, int b) {
		int hcf = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}

	static int lcm(int a, int b) {
		int l = a > b ? a : b;
		while (true) {
			if (l % a == 0 && l % b == 0)
				break;
			l++;
		}
		return l;
	}

	static int reverse(int n) {
		int reverse = 0;
		int remainder;
		while (n > 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n /= 10;
		}
		return reverse;
	}
	static void divisor(int n)
	{
		for(int i=1;i<=n;i++)
		{
		if (n%i==0) System.out.println(i);
		}
		
	}

	static void palindrome(int n) {
		int reverse = 0;
		int remainder;
		while (n > 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n /= 10;
		}
		if (reverse == n)
			System.out.println("its a palindrome num");
		else
			System.out.println("its not a palindrome num");
	}

	static int sum(int n) {
		int s = 0;
		while (n > 0) {
			int hold = n % 10;
			s += hold;
			n /= 10;
		}
		return s;
	}

	static void multiple(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));
		}
	}

	static void niven_harshad(int n) {
		// interview question why cant take other than(n%10)
		if (n < 1)
			System.out.println("please dont enter negative num");
		else {

			int s = sum(n);
			if (n % s == 0) {

				System.out.println("its a niven num");
			} else {
				System.out.println("its not a niven num");
			}
		}

	}

	static void automorphic(int n) {
		if (n < 1)
			System.out.println("please dont enter negative num");
		else {
			int hold = 1;
			int l = len(n);
			int sq = pow(n, 2);
			hold = sq % pow(10, l);

			if (hold == n)
				System.out.println("num is automorphic");
			else {
				System.out.println("num is not automorphic");
			}

		}
	}

	static void magic(int n) {
		if (n < 1)
			System.out.println("please dont enter negative num");
		else {
			int s = sum(n);
			int r = reverse(s);
			int k = r * s;
			if (k == n)
				System.out.println("its a magic num");
			else {
				System.out.println("its not a magic num");
			}

		}
	}

	static void magic_(int a, int b) {
		for (int i = a; i <= b; i++) {
			int s = sum(i);
			int r = reverse(s);
			int k = r * s;
			if (k == i)
				System.out.println(i);
		}
	}

	static void neon(int n) {
		int sq=pow(n,2);
		int s = sum(sq);
		if (s == n)
			System.out.println("num is neon num");
		else {
			System.out.println("num is not neon num");
		}
	}

	static void onetic(int n) {
		int s=0;
		do {
			// s=sum(n);
		s = 0;
			while (n>0) {
			int hold = n%10;
			s += hold;			
			n /= 10;
			}
			n=s;
		} while (s>=9);
		System.out.println(s);
		if (s==1)
			System.out.println("THIS IS AN ONETIC NUM");
		else {
			System.out.println("THIS IS NOT AN ONETIC NUM");
		}
	}

	static void squarsumtic(int n) {
		int s = 0;
		int k=sum(n);
		int temp = n;
		while (n>0) {
			int hold = n % 10;
			int sq = pow(hold, 2);
			s += sq;
			n /= 10;	
		}
		 n=temp;
		if (n==k)
			System.out.println("The num is a squarsumtic num");
		else {
			System.out.println("The num is not a squarsumtic num");
		}

	}
	
	
}