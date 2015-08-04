import java.math.*;

public class Rational {
		public static void A(){
		int numerator =0;
		int demoninatr =1;
			}
	public static void PrintRational(int a, int b){
		System.out.println(a+ "/"+b);		
	}
	public static void negate(int a ,int b){
		System.out.println("-"+a+"/"+b);		
	}
	public static void invert(int a, int b){
		int temp ;
		temp = a;
		a = b;
		b = temp;
		System.out.println("By inversing the Rational Number, value  ="+a+"/"+b);
			}
	public static void toDouble(int a, int b){
		double i = 1.0;
		System.out.println(a*i+"/"+b*i);
	}
	public static void GCD(BigInteger a, BigInteger b){
		int i=1;
		BigInteger c = (a).gcd(b);
		System.out.println("The value of GCD of two numbers is"+c);
	}
	public static void Addition(int a,int b){
		int c = a+b;
		Print1(c);
	}
	public static void Print1(int c){
		System.out.println("the value of adding numerator and denominator is"+c);
	}
	public static void main(String [] args){
		Rational Rat = new Rational();
		int a = 12;
		int b = 8;
		BigInteger b1 = new BigInteger("12");
		BigInteger b2 = new BigInteger("4");
				Rat.PrintRational(a,b);
				Rat.negate(a,b);
				Rat.invert(a, b);
				Rat.toDouble(a,b);
				Rat.Addition(a, b);
				Rat.GCD(b1, b2);
	}
	
}
