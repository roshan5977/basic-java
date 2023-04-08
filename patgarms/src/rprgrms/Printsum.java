package rprgrms;
import java.util.Scanner;
//sum 1 to n
public class Printsum {

	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		if(n==0)
		{
			return n;
		}
	return  n+=sum(n-1);
	}

}
