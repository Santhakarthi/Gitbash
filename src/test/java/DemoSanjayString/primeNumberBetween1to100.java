package DemoSanjayString;

public class primeNumberBetween1to100 {

	public static void main(String[] args) {
		for(int n=1;n<=30;n++) {
			int temp=0;
			for(int i=2;i<=n-1;i++)
			{
				if(n%i==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(n +" ");
			}
		}
	}

}
