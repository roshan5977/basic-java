package rprgrms;

public class Fib {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		fibo(a,b,10);
	}
	public static void fibo(int a,int b,int n) {
		if(n==0)
		{
			return;
		}
		int c=a+b;//1
		System.out.println(c);
		fibo(b,c,n-1);//1,1
	}

}
