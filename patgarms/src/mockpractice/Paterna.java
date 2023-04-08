package mockpractice;

public class Paterna {

	public static void main(String[] args) {
		int n = 14,star=n/2;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = 1; j <=star; j++, num++)
				System.out.print(num);
			if(i<=n)
			{
				star+=2;
			}
			System.out.println();
		}
	}
}
