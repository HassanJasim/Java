package cas.XB3.lab4.wt;

public class Stopwatch {
	private final long start;
	public Stopwatch () {
		start = System.currentTimeMillis();
	}
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now-start)/1000.0;
	}
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		double sum1 =0;
		for (int i =1; i<=n;i++) {
			sum1 = sum1 +Math.sqrt(i);
		}
		Stopwatch mystop = new Stopwatch();
		double time1 = mystop.elapsedTime();
		System.out.printf("%e (%.2f seconds, args)\n", sum1 , time1);
	}

}
