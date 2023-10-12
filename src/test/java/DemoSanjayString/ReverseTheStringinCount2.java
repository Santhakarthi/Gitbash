package DemoSanjayString;

public class ReverseTheStringinCount2 {

	public static void main(String[] args) {
	String s="I am from Bangalore";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		if(s.charAt(i)!=' ') {
			rev=rev+s.charAt(i);
		}
	}
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)==' ') {
		rev=rev.substring(0,i)+" "+rev.substring(i,rev.length());
	}
}
System.out.println(rev);
	}

}
