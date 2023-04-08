package rprgrms;
//core java tutorial
public class Sumnum {

	public static void main(String[] args) {
		//printsum(1,5,0);
		fact(1,6,1);
	}
	public static void printsum(int i,int n,int sum) {
		if(i==n)
		{
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		printsum(i+1,n,sum);
	}
	public static void fact(int i,int n,int prod) {
		if(i==n)
		{
			prod*=i;
			System.out.println(prod);
			return;
		}
		prod*=i;
		fact(i+1,n,prod);
	}

}
