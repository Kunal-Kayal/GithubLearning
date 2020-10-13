package basicAlgorithmforCP;

public class ModuloArithmatic {

	public static void main(String[] args) {
		/*
        Modulo Arithmatic
        ---------------------------------------------
        (a+b)%n=(a%n+b%n)%n;
        (a*b)%n=(a%n+b%n)%n;
		 */
		//wap to find the power of a given number a and the power is b output should be module of 1000000007;
		int a=67899;
		int b=223;
		int res=1;
		while(b>0) {
			if((b&1)!=0) {
			res=(res*a%1000000007)%1000000007;
			}
			a=a*a;
			b=b>>1;
		}
		System.out.println(res);

	}

}
///for more details see the code chef problem
//https://www.codechef.com/LRNDSA01/problems/MULTHREE
