package rprgrms;

public class PrintOneToFive {

	public static void main(String[] args) {
       int n=5;
       print(n);
	}
	public static void print(int n) {
		System.out.println(n);
		if(n==1)return;
		print(n-1);
	}
}
