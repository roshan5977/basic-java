package mockpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//use regex
public class ConvertNdSum {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.next(),s2="";int sum=0;
     for(int i=0;i<s.length();i++)
     {
    	   if(s.charAt(i)>='A'&&s.charAt(i)<='Z')s2+=(char)(s.charAt(i)+32);
    	 else  if(s.charAt(i)>='a'&&s.charAt(i)<='z')s2+=(char)(s.charAt(i)-32);
     }
 	Pattern p=Pattern.compile("[0-9]");
	Matcher m=p.matcher(s);
	 while(m.find()) {
		 sum+=Integer.parseInt(m.group());
	 }
     System.out.println(s2+sum);
     sc.close();
	}

}
