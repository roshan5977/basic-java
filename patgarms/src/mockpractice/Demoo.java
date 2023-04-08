package mockpractice;

public class Demoo {

	public static void main(String[] args) {
     String s="ROeiShan@8249",s1="";
     s=s.toUpperCase();
     int sum=0;
     for(int i=0;i<s.length();i++)
     {
    	 char c=s.charAt(i);
    	 switch (c) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':s=s.replace(c+"", "");
		}
     }
     System.out.println(s);
	}
	

}
