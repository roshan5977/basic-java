package com.jsp.codewithlucky;

import java.util.Scanner;

class Patern1 {
	public void patern1(int n) {
		int incdec = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= incdec; j++) {
				System.out.print(j);
			}
			if (i <= n / 2)
				incdec++;
			else
				incdec--;
			System.out.println();
		}
	}
}

class Patern2 {
	public void patern2(int n) {
		int incdec = (n / 2) + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= incdec; j++) {
				System.out.print(j);
			}
			if (i <= n / 2)
				incdec--;
			else
				incdec++;
			System.out.println();
		}
	}
}

class Patern3 {
	public void patern3(int n) {
		int space = n - 1;
		int incdec = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= incdec; j++) {
				System.out.print(j);
			}
			space--;
			incdec++;
			System.out.println();
		}
	}
}

class Patern4 {
	public void patern4(int n) {
		int space = 0;
		int incdec = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= incdec; j++) {
				System.out.print(j);
			}

			space++;
			incdec--;
			System.out.println();
		}
	}
}

class Patern5 {
	public void patern5(int n) {
		int space = 0;
		int incdec = (n / 2) + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= incdec; j++) {
				System.out.print(incdec);
			}
			if (i <= n / 2) {
				space++;
				incdec--;
			} else {
				space--;
				incdec++;
			}
			System.out.println();
		}
	}
}

class Patern6// imp
{
	public void patern6(int n) {
		int space = n - 1;
		int incdec = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int f = i;
			for (int j = 1; j <= incdec; j++) {
				if (j % 2 != 0) {
					System.out.print(f);
					++f;
				} else {
					System.out.print(" ");
				}
			}
			if (i <= n / 2) {
				space--;
				incdec += 2;
			} else {
				space++;
				incdec -= 2;
			}
			System.out.println();
		}
	}
}

class Patern7 {
	public void patern7(int n) {
		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				--k;
			}
			int t = 2;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(t);
				++t;
			}
			System.out.println();
		}
	}
}

class Patern8 {
	public void patern8(int n) {
		for (int i = 1; i <= n; i++) {
			int k = (n - i) + 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				++k;
			}
			System.out.println();
		}
	}

}

class Patern9 {
	public void patern9(int n) {
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				++k;
			}
			System.out.println();
		}
	}

}

class Patern10 {
	public void patern10(int n) {
		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {

				System.out.print(k + " ");
				++k;
			}
			System.out.println();
		}
	}

}

class Patern11 {
	public void patern11(int n) {
		int stars = 1;
		int spaces = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			int k = i, t = k;
			for (int j = 1; j <= stars; j++) {
				if (i <= n / 2) {
					if (j <= stars / 2) {
						System.out.print(t);
						--t;
					} else {
						System.out.print(t);
						t++;
					}
					k++;
				} else {
					if (j <= stars / 2) {
						k=((n-i)+2)-j;
						System.out.print(k);
					} else {
						
						System.out.print(k);
						
					}
					
				}
			}
				System.out.println();
				if (i <= n / 2) {
					stars += 2;
					spaces--;
				} else {
					stars -= 2;
					spaces++;
				}
			}
		}
	}


class Patern12 {
	public void patern12(int n) {

		int spaces=(n/2)-1;
		int num1=0;
		int num2=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			int k1=i;
			for(int j=1;j<=num1;j++)
			{
				if (i<=n/2) {
					System.out.print(k1);
					k1--;
				}
				else {
					int k4=(n-i)+1-j;
					System.out.print(k4);
					k4--;
					k1--;
				}
				
			}
			int k2=1;
			for(int j=1;j<=num2;j++)
			{
				System.out.print(k2);
				k2++;
			}
		
		System.out.println();
		if (i<n/2) {
			spaces--;
			num1++;
			num2++;
		}
		else {
			spaces++;
			num1--;
			num2--;
		}
	}
	}

}

class Patern13 {
	public void patern13(int n) {
		int spaces=n-1;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print("+ ");
			}
			spaces--;
			num+=2;
			System.out.println();
		}
	}

}

class Patern14 {
	public void patern14() {

	}

}

class Patern15 {
	public void patern15() {

	}

}

class Patern16 {
	public void patern16() {

	}

}

class Patern17 {
	public void patern17() {

	}

}

class Patern18 {
	public void patern18() {

	}

}

class Patern19 {
	public void patern19() {

	}

}

class Patern20 {
	public void patern20() {

	}

}

class Patern21 {
	public void patern21() {

	}

}

class Patern22 {
	public void patern22() {

	}

}

class Patern23 {
	public void patern23() {

	}

}

class Patern24 {
	public void patern24() {

	}

}

class Patern25 {
	public void patern25() {

	}

}

public class PaternMain extends Patern13 {

	public static void main(String[] args) {
		System.out.println("enter a num");
		int num = new Scanner(System.in).nextInt();
		PaternMain paternObj = new PaternMain();
		paternObj.patern13(num);
	}
}
