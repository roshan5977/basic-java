package com.jsp.stringprogram;

public class ReverseSentenceSpecial {
//   i/p: my pennis is too hard to fuck ur pussy;
//	o/p: my sinnep is oot hard ot fuck ru pussy;
	public static void main(String[] args) {
		String s = "my pennis is too hard to fuck ur pussy suck";
		reversesentenevn(s);
	}

	public static void reversesentenevn(String s) {
		// suck yssup ur kcuf to darh too si pennis ym
		String s1 = "";
		char[] a = s.toCharArray();
		for (int i = a.length - 1, j = a.length - 1, count = 1; i >= 0; i--, count++, j = i) {
			while (i >= 0 && a[i] != ' ')
				i--;
			if (count % 2 != 0)
				for (int k = i + 1; k <= j; k++)
					s1 += a[k];
			else
				for (int k = i + 1; j >= k; j--)
					s1 += a[j];
			if (i > 0)
				s1 += " ";
		}
		System.out.println(s1.trim());
	}

	public static void reverseeven(String s) {
		String s1 = "";
		char a[] = s.toCharArray();
		for (int i = 0, j = 0, count = 1; i < a.length; count++, i++, j = i) {
			while (i < a.length && a[i] != ' ')
				i++;
			if (count % 2 != 0)
				for (int k = i - 1; j <= k; j++)
					s1 += a[j];
			else
				for (int k = i - 1; k >= j; k--)
					s1 += a[k];
			if (i <= a.length)
				s1 += ' ';
		}
		System.out.println(s1.trim());
	}
}
