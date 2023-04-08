package mockpractice;

public class An {

	public static void main(String[] args) {
String s="Triangle";
String a="INTEGRAL";
s=s.toLowerCase();
a=a.toLowerCase();
for(int i=0;i<s.length();i++)
{
	for(int j=0;j<s.length();j++)
		if(s.charAt(i)!=a.charAt(j))System.out.println("not a anagrm");
}
System.out.println("anagram");
	}

}
