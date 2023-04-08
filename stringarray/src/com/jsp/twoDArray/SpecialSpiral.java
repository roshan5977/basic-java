package com.jsp.twoDArray;

public class SpecialSpiral {

	public static void main(String[] args) {
		
		int [][]a=new int[5][5];
     int num=1;
     int len=a.length-1;
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a.length;j++)
    	 {
    		 switch (a[i][j]) {
			case a[0][1]:i=0;
				a[i][j]=num++;
				break;
	        case a[i][len]:
		 a[i][j]= num++;
				break;
	          case a[len][j]:num++;
		break;
	       case a[i][0]:num++;
		break;
		default:
	break;
			}
    	 }
     }
     MatrixMultiplication.print(a);
	}
//	public static int [][] spiral(int [][]a)
//	{
//		for(int i=0;i<a.length;i++)
//	     {
//	    	 for(int j=0;j<a.length;j++)
//	    	 {
//	    	
//	    	 }
//	     }

}
