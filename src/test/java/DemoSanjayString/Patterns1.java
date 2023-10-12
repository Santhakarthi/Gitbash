package DemoSanjayString;

public class Patterns1 {

	public static void main(String[] args) {
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		
		
		int n=5;
		for(int i=1;i<n;i++) {
			
			//i=1 1<=5t
			//i=2 2<=5t
			//i=3 3<=5t
			//i=4 4<=5t
			//i=5 5<=5t
			//i=6 6<=5f terminate
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
