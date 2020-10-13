package basicAlgorithmforCP;

public class GCD {

	public static void main(String[] args) {
		//determint the GCM of two numbers
		//aply gcd rules:
		//gcd(a,b)=gcd(b,a%b);
		//formula a*b=GCD(a,b)*LCM(a,b)
		//lcm(a,b)=(a*b)/GCD(a,b)
		int a=4;
		int b=3;
		System.out.println(GCD(a,b));
		System.out.println("LCM(a,b)="+((a*b)/GCD(a,b)));
		
		

	}
	static int GCD(int a,int b) {
		if(b==0)return a;
		return GCD(b,a%b);
		
	}

}
