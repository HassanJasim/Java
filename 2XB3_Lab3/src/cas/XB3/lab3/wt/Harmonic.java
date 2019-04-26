package cas.XB3.lab3.wt;

public class Harmonic {
		 public static double harmonic(int n) {
			 double sum = 0.0;
		 //sum of 1/1 + 1/2 + 1/3 + ... + 1/n
		 //your code here
			 for (int i = 0; i <= n; i++) {
				 sum += 1.0/i;
			 }
			 return sum;
		 }
		 
		 
		 public static void main(String[] args) {
			 for (int i = 0; i < args.length; i++) {
				 int arg= Integer.parseInt(args[i]);
				 double value = harmonic(arg);
				 System.out.println(value);
			 }
		 }
		 
	

}
