package cas.XB3.lab3.wt;

public class Hyperbolic {
	
	public static double cosh(double x) {
		
		double cosh = (Math.exp(x)- Math.exp(-1*x))/2.0;
		return cosh;
	}
		 public static double sinh(double x) {
			 return (Math.exp(x)+ Math.exp(-1*x))/2.0;
			 
		 }
		 public static double tanh(double x) {
			 return sinh(x)/cosh(x);
		 }
		 public static void main(String[] args) {
		 double x = Double.parseDouble(args[0]);
		 System.out.printf("sinh(%f) = %f\n", x, sinh(x));
		 System.out.printf("cosh(%f) = %f\n", x, cosh(x));
		 System.out.printf("tanh(%f) = %f\n", x, tanh(x));

		 }
}