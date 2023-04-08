package com.jsp.second;

import java.util.Scanner;

public class Test301 {

	public static void main(String[] args) {
           System.out.println("WELCOME TO DARK WORLD CODING");
           System.out.println("ENTER YOUR NAME");
           Scanner sc = new Scanner(System.in);
           String name=sc.next();
           System.out.println("HEY "+name+" WELCOMING U TO DARK WORLD CODING..."
           		+ "U CAN EXPLORE WHAT EVER U WANT HERE...");
           for(;;)
           {
           System.out.println("ENTER THE CHOICES U WANT TO KNOW ABOUT \n "
           		+ "1.COUNT THE ENTERED NUM \n "
           		+ "2.SUM THE ENTERED NUM \n "
           		+ "3.FIND THE FACTORIAL OF ENTERED NUM \n "
           		+ "4.ENTER THE MULTIPLE TABLE U WANNA KNOW \n "
           		+ "5.ENTER THE NUM ND CHECK NUM IS PRIME OR NOT \n "
           		+ "6.ENTER THE NUM ND CHECK NUM IS ARMSTRONG OR NOT \n "
           		+ "7.ENTER TWO NUM FIND THE PRIME NUM BETWN THEM  \n "
           		+ "8.ENTER TWO NUM FIND THE ARMSTRONG NUM BETWN THEM \n "
           		+ "9.CHECK NUM IS PERFECT NUM OR NOT \n "
           		+ "10.CHECK THE NUM IS EVEN OR ODD \n "
           		+ "11.CALCULATE THE POWER OF A NUM \n "
           		+ "12.CHECK THE NUM IS STRONG OR NOT \n "
           		+ "13.SAY HOW MANY FIBONACCI NUM U WANNA KNOW \n "
           		+ "14.SAY UPTO WHAT FIBONACCI NUM U WANT \n "
           		+ "15.ENTER THE RANGE OF FIBONACCI NUM U WANNA KNOW \n "
           		+ "16.FIND THE LCM OF ENTERED NUM \n "
           		+ "17.FIND THE GCD OF ENTERED NUM \n "
           		+ "18.FIND THE REVERSE OF ENTERED NUM \n "
           		+ "19.CHECK WHETHER NUM IS PALINDROME OR NOT \n "
           		+ "20.FIND THE DIVISOR OF ENTERED NUM \n "
           		+ "21.CHECK WETHER ENTERED YEAR IS A LEAP YEAR OR NOT \n "
           		+ "22.SAY HOW MANY DAYS ARE THERE IN THE ENTERED MONTH \n "
           		+ "23.SWAP THE ENTERED NUMS \n "
           		+ "24.CHECK HOW MANY STRONG NUM ARE THERE IN BETWEEN \n "
           		+ "25.CHECK HOW MANY PERFECT NUM ARE THERE IN BETWEEN \n "
           		+ "26.CHECK WHETHER NUM IS NIVEN NUM OR NOT \n "
           		+ "27.CHECK WHETHER NUM IS MAGIC NUM OR NOT \n "
           		+ "28.CHECK WHETHER NUM IS AUTOMORPHIC NUM OR NOT \n "
           		+ "29.CHECK WHETHER NUM IS NEON NUM OR NOT \n "
           		+ "30.CHECK WHETHER NUM IS ONETIC NUM OR NOT \n "
           		+ "31.CHECK WHETHER NUM IS SQUARSUMTIC NUM OR NOT \n ");
           int choice=sc.nextInt();
           if (choice==1) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA COUNT");
        	   int one=sc.nextInt();
        	   System.out.println(one+" is of length= "+Thirdcode.len(one));
        	  
		}
           if (choice==2) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA DO SUM THE DIGITS");
        	   int two=sc.nextInt();
        	   System.out.println("BOSS sum of digits in "+ two+" is "+Thirdcode.sum(two));
        	 
		}
           if (choice==3) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA FIND FACTORIAL");
        	   int three=sc.nextInt();
        	   System.out.println("BOSS Factorial of "+three+"is "+Thirdcode.factorial(three));
        	  
		}
           if (choice==4) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA FIND MULTIPLE TABLE");
        	   int four=sc.nextInt();
        	   System.out.println("BOSS The multiple table of "+four+" is below!!!");
        	   Thirdcode.multiple(four);
		}
           if (choice==5) {
        	   System.out.println("BOSS ENTER THE NUM I WILL CHECK PRIME");
        	   int five=sc.nextInt();
        	   Thirdcode.prime(five);
        	
		}
           if (choice==6) {
        	   System.out.println("BOSS ENTER THE NUM I WILL CHECK ARMSTRONG");
        	   int six=sc.nextInt();
        	   Thirdcode.armstrong(six);
        	 	  
		}
           if (choice==7) {
        	   System.out.println("BOSS ENTER THE FIRST NUM FOR PRIME RANGE");
        	   int seven=sc.nextInt();
        	   System.out.println("BOSS ENTER THE SECOND NUM FOR PRIME RANGE");
        	   int seven_=sc.nextInt();
        	   Thirdcode.primerange(seven,seven_);
        	  
		}
           if (choice==8) {
        	   System.out.println("BOSS ENTER THE FIRST NUM FOR ARMSTRONG RANGE");
        	   int eight=sc.nextInt();
        	   System.out.println("BOSS ENTER THE SECOND NUM FOR ARMSTRONG RANGE");
        	   int eight_=sc.nextInt();
        	   Thirdcode.armstrongrange(eight,eight_);
        	  
		}
           if (choice==9) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA FIND PERFECT NUM");
        	   int nine=sc.nextInt();
        	   System.out.println(nine+"is of length= "+Thirdcode.len(nine));
        	  
		}
           if (choice==10) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA COUNT");
        	   int ten=sc.nextInt();
        	   System.out.println(ten+"is of length= "+Thirdcode.len(ten));
        	  
		}
           if (choice==11) {
        	   System.out.println("BOSS ENTER THE BASE NUM");
        	   int eleven=sc.nextInt();
        	   System.out.println("BOSS ENTER THE EXPONENT ");
        	   int eleven_=sc.nextInt();
        	   System.out.println("SO THE NUM "+eleven+" TO THE POWER "+eleven_+" IS "+Thirdcode.pow(eleven,eleven_));
        	  
		}
           if (choice==12) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA COUNT");
        	   int twelve=sc.nextInt();
        	   System.out.println(twelve+"is of length= "+Thirdcode.len(twelve));
        	  
		}
           if (choice==13) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA WRITE THOSE MANY FIBONACCI NUM");
        	   int thirteen=sc.nextInt();
        	   Thirdcode.fib(thirteen);
        	  
		}
           if (choice==14) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA WRITE THOSE FIBONACCI NUM UPTO");
        	   int forteen=sc.nextInt();
        	   Thirdcode.fib_upto(forteen);
        	  
		}
           if (choice==15) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA WRITE THE RANGE OF FIBONACCI first num ");
        	   int fifteen=sc.nextInt();
        	   System.out.println("BOSS ENTER THE NUM I WANNA WRITE THE RANGE OF FIBONACCI second num ");
        	   int fifteen_=sc.nextInt();
        	  Thirdcode.fib_range(fifteen,fifteen_);
		}
           if (choice==16) {
        	   System.out.println("BOSS ENTER THE FIRST NUM FOR LCM");
        	   int sixteen=sc.nextInt();
        	   System.out.println("BOSS ENTER THE SECOND NUM FOR LCM");
        	   int sixteen_=sc.nextInt();
        	   System.out.println("The lcm for "+sixteen+" and "+sixteen_+" is "+Thirdcode.lcm(sixteen,sixteen_));
        	  
		}
           if (choice==17) {
        	   System.out.println("BOSS ENTER THE FIRST NUM FOR GCD");
        	   int seventeen=sc.nextInt();
        	   System.out.println("BOSS ENTER THE SECOND NUM FOR GCD");
        	   int seventeen_=sc.nextInt();
        	   System.out.println("The gcd for "+seventeen+" and "+seventeen_+"is of length= "+Thirdcode.gcd(seventeen,seventeen_));
        	  
		}
           if (choice==18) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA REVERSE");
        	   int eighteen=sc.nextInt();
        	   System.out.println("THE REVERSE OF "+eighteen+"is"+Thirdcode.reverse(eighteen));
        	  
		}
           if (choice==19) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA CHECK NUM IS PLAINDROME OR NOT ");
        	   int ninteen=sc.nextInt();
        	  Thirdcode.palindrome(ninteen);
        	  
		}
           if (choice==20) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA SAY THE DIVISOR OF THAT NUM ");
        	   int twenty=sc.nextInt();
        	   Thirdcode.divisor(twenty);
        	  
		}
           if (choice==21) {
        	   System.out.println("BOSS ENTER THE NUM I WANNA COUNT");
        	   int twentyone=sc.nextInt();
        	   System.out.println(twentyone+"is of length= "+Thirdcode.len(twentyone));
		}
           if (choice==26) {
        	   System.out.println("BOSS ENTER THE NUM I WANANA CHECK IT NIVEN NUM OR NOT");
        	   int twentyfive=sc.nextInt();
        	   Thirdcode.niven_harshad(twentyfive);
		}
           if (choice==27) {
        	   System.out.println("BOSS ENTER THE NUM I WANANA CHECK IT MAGIC NUM OR NOT");
        	   int twentyseven=sc.nextInt();
        	   Thirdcode.magic(twentyseven);
		}
           if (choice==50) {
        	   System.out.println("BOSS ENTER THE FIRST NUM I WANANA CHECK IT MAGIC NUM OR NOT");
        	   int twentysevene=sc.nextInt();
        	   System.out.println("BOSS ENTER THE FIRST NUM I WANANA CHECK IT MAGIC NUM OR NOT");
        	   int twentysevene_=sc.nextInt();
        	   Thirdcode.magic_(twentysevene,twentysevene_);
		}
           if (choice==28) {
        	   System.out.println("BOSS ENTER THE NUM I WANANA CHECK IT AUTOMORPHIC NUM OR NOT");
        	   int twentyeight=sc.nextInt();
        	   Thirdcode.automorphic(twentyeight);
		}
           if (choice==29) {
        	   System.out.println("BOSS ENTER THE NUM I WANANA CHECK IT NEON NUM OR NOT");
        	   int twentynine=sc.nextInt();
        	   Thirdcode.neon(twentynine);
		}
           if (choice==30) {
        	   System.out.println("BOSS ENTER THE NUM I WANANA CHECK IT ONETIC NUM OR NOT");
        	   int thirty=sc.nextInt();
        	   Thirdcode.onetic(thirty);
		}
           if (choice==31) {
        	   System.out.println("BOSS ENTER THE NUM I WANANA CHECK IT SQUARSUMTIC NUM OR NOT");
        	   int thirtyone=sc.nextInt();
        	   Thirdcode.squarsumtic(thirtyone);
		}
           System.out.println("DO U ALLOW ME TO SERVE U AGAIN "
           		+ "PRESS Y OR N");
           char press=sc.next().charAt(0);
           if (press=='y'||press=='Y')  continue;
           else {
        	   System.out.println("THANK A LOT BOSS DID U NJOY"
        	   		+ "HOPE U WILL VISIT AGAIN ");
           }	
           }      
	}
}