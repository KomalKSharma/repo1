package repo1;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num = 20; 
	    int count;  

	    for (int i = 2; i <= num; i++) {
	      count = 0; 

	      for (int j = 2; j < i; j++) {
	        if (i % j == 0) {
	          count++;  
	          break; 
	        }
	      }
	      if (count == 0) {
	        System.out.println(i);  
	      }
	    }
		
		
		
		/*int k = 2;
		int count = 20;
		for(int i = 2; i<=count; i++) {
			if(k%2==1 && k%1==0) {
				System.out.println(k);
			}
			++k;
		} */
		
		
		//PrimeNumbers result = new PrimeNumbers();
		//result.Prime();

	}

/*	void Prime() {
			int i;
			int counter=0;
			for(i=2; i<=counter/2; ++i) {
				for(int j=0; j<=24; j++) {
				if(counter%i==0) {
					System.out.println("prime number is:" + i);
				}
			}
			counter++;
		}
	} */
	
	//i = for loop 24; number = to find prime or not;
	// condition 1 - counter = number/2;
	//condition 2 - number!=0 || number!=1
/*	int primeNumber() {
		int i = 0;
		int num=3;
		int counter=0;
		while(i<=num/2) {
			if(num!=0 || num!=1) {
				System.out.println("this is the prime number: " + num);
			}
		}
		
		return num;
	}
	
	*/

}
