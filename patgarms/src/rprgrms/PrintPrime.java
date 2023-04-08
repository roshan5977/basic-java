package rprgrms;
public class PrintPrime {
	public static void main(String[] args) {
     System.out.println(checkprime(2,102));
	}
	public static boolean checkprime(int i,int n) {
		if(i==n/2)
		{
			if(n%i!=0)return true;
		}
		if( (n%i!=0)&&checkprime(i+1,n))return true;
		return false;
	}
}
