package mockpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mov {
//print non repeating char
	public static void main(String[] args) {
//		Matcher m = Pattern.compile("([a-z])\\1").matcher("buffallo");
//      while(m.find())System.out.println(m.replaceAll(""));
		Matcher m = Pattern.compile("([a-z])\\1{1}").matcher("buffallo");
	      while(m.find())System.out.println(m.group());;
      
      
      
      
      
//       String s="buffallo";
//       Pattern p=Pattern.compile("([a-z])\\1");
//       Matcher m=p.matcher(s);
       
//      for(String s1="";s.length()>0;s=s1)
//      {
//    	  char c=s.charAt(0);
//    	 s1= s.replace(c+"", "");
//    	 int count=s.length()-s1.length();
//    	if(count>1) System.out.print(c);
//      }
      
	}

}
