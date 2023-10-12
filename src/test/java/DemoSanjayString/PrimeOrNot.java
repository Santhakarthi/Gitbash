package DemoSanjayString;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("PrimeNumber");
		}
		else {
			System.out.println(" Not a PrimeNumber");
		}
	}

}
