package rprgrms;

public class PrintPower {

	public static void main(String[] args) {
            System.out.println( power(2,7,1));
	}
	public static int power(int base,int exp,int pow) {
		if(exp==1)
		{
			return base;
		}
		return base*power(base,exp-1,pow);
	}

}
