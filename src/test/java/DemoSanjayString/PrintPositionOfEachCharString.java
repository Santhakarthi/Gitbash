package DemoSanjayString;

public class PrintPositionOfEachCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Tester";//t=1 e=2 s=3 r=6
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i)+""+(i+1));
		}
	}

}
