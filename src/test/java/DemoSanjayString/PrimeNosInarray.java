package DemoSanjayString;

public class PrimeNosInarray {

	public static void main(String[] args) {
		int[] a= {4,5,2,3,6,8,9};

	
		 for (int i = 0; i < a.length; i++){
	            int temp = 0;
	            
	            for (int j = 2; j <= a[i] - 1; j++){
	                if (a[i] % j == 0){
	                    temp = temp + 1;
	                }
	            }
	            if (temp == 0){
	                System.out.println( a[i]+" Prime number");
	            }
	            else
	            {
	                System.out.println(a[i]+" Not Prime Number");
	            }
	        }
		
		
	}

}
