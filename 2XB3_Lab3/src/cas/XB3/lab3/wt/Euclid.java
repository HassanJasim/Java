package cas.XB3.lab3.wt;

public class Euclid {
	 // recursive implementation
	 public static int gcd(int p, int q) {
	 //recursively find the greatest common divisor
	 //your code here
		 if( q== 0)return p;
		 else return gcd(q, p % q);
	 }
	 // non-recursive implementation
	 public static int gcd2(int p, int q) {
	 //non-recursively find the greatest common divisor
	 //your code here
		 while ( q != 0) {
			 int tmp = q;
			 q = p % q;
			 p = tmp;
		 }
		return p;
	 }
	 public static void main(String[] args) {
	 int p = Integer.parseInt(args[0]);
	 int q = Integer.parseInt(args[1]);
	 int d = gcd(p, q);
	 int d2 = gcd2(p, q);
	 System.out.println("gcd(" + p + ", " + q + ") = " + d);
	 System.out.println("gcd(" + p + ", " + q + ") = " + d2);
	 }

}
