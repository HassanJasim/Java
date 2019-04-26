
package cas.XB3.lab4.wt;


public class Point {
	

	
	private double x;
	private double y;
	
	//create and init a point with given x and y
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//returns Euclidean distance between invoking point p and q
	public double distanceTo(Point that) {
		double dx = this.x - that.x;
		double dy = this.y - that.y;
		return Math.sqrt(dx*dy + dy*dy);
	}

	public void draw() {
		StdDraw.point(x,y);
	}
	public void drawTo( Point that) {
		StdDraw.line(this.x, this.y, that.x, that.y);
	}
	public String toString() {
		
		return "(" + x + "," + y + ")";
	}
	public static void main (String [] args) {
		Point p = new Point(0.6, 0.2);
		System.out.println("p = " + p);
		Point q = new Point (0.5, 0.5);
		System.out.println("q = " + q);
		System.out.println("dist(p,q); = " + p.distanceTo(q));
		
	}
}
