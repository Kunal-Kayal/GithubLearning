//dynamic progranmming we use the preveious result if needed instead of doing the computation again. This reduces the time complexcity of a given probelm.


/*
 * Q.1) Fibonaccy sequence
 * .................................................
 * given the value of "n" and we have to output the nth value of the fibonacy sequence
 * ...........................................
 * we can solve this problem:----1.recursion
 * 2.Dynamic Programming----a.)memoization
 * b.)tabulation
 */
package basicAlgorithmforCP;

import java.util.*;

public class DynamicProgramming {
/* Using Recursion:
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
			

	}
	
	static int fib(int n) {
		if(n<=1)return n;
		return fib(n-1)+fib(n-2);
	}
	
	*/
	
	/* using a.)memoization
	static final int MAX=100;
	static final int NIL=-1;
	
	static int fibo[]=new int[MAX];
	
	static void initial() {
	
		for(int i=0;i<MAX;i++) {
			fibo[i]=NIL;
		}
	}
	
	static int fib(int n) {
		if(fibo[n]==NIL) {
			if(n<=1)fibo[n]=n;
			else fibo[n]=fib(n-2)+fib(n-1);
		}
		return fibo[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		DynamicProgramming f= new DynamicProgramming();
		f.initial();
		System.out.println(f.fib(n));
		
	}
	*/
	
	/*using b.)tabulation
	
	public static void main(String[] args) {
		
		int n=7;
		System.out.println(fib(n));
	}
	
	static int fib(int n) {
		int fibo[]=new int[n+1];
		
		fibo[0]=0;
		fibo[1]=1;
		
		for(int i=2;i<=n;i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		return fibo[n];
	}
	*/

}

