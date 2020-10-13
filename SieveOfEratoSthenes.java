package basicAlgorithmforCP;

import java.util.Arrays;

public class SieveOfEratoSthenes {

	public static void main(String[] args) {
		//determin a number is prime or not
//	 long time=System.currentTimeMillis();
//	 int n=10000003;
//	 int count=0;
//	 boolean isPrime=true;
//	 for(int i=2;i<=n;i++) {
//		 count++;
//		 if(n%i==0) {
//			 isPrime=false;
//			 break;
//		 }
//	 }
//	 long lasttime=System.currentTimeMillis();
//	 if(isPrime)System.out.println("The number is prime");
//	 else System.out.println("The numbeer is not prime");
//	 System.out.println("time taken:"+(lasttime-time));
//	 System.out.println("Steps taken"+count);
		// calculate the prime number between 1 to n;
		int n=123;
		boolean isPrime[]=new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i*i<=n;i++) {
			for(int j=i*2;j<=n;j+=i)isPrime[j]=false;
		}
		for(int i=0;i<n;i++) {
			if(isPrime[i]==true)System.out.print(i+" ");
		}
	}

}
