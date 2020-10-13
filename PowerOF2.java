package basicAlgorithmforCP;
import java.util.*;
/*
 * to know the number id power of twoo or not
 */

public class PowerOF2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.println(isPowerOfTwo(n));
//		
//		int arr[]=new int[10];
//		Arrays.setAll(arr, i->i+1);
//		for(int a:arr) {
//			System.out.println(a);
//		}
//
//	}
//	static boolean isPowerOfTwo(int n) {
//		return (int)(Math.ceil(Math.log(n)/Math.log(2)))==(int)(Math.floor(Math.log(n)/Math.log(2)));
//		}
		/*
		 * now the programme to find the highest number power of two of a given range
		 */
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(thePowerOfTwo(n));
		long x=123456789000L;
		long y=sc.nextLong();
	}
	static int thePowerOfTwo(int n) {
		int temp=(int)Math.floor(Math.log(n)/Math.log(2));
		return (int)Math.pow(2,temp);
	}
	
	static long g(long x,long y) {
		long n=x^y;
		long temp=(long)Math.floor(Math.log(n)/Math.log(2));
		return (long)Math.pow(2,temp);
	}

}
