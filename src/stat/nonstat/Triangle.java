package stat.nonstat;

public class Triangle {
	private int a;
	private int b;
	private static int c;
	public Triangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public static int getC() {
		return c;
	}
	public static void setC(int c) {
		Triangle.c = c;
	}
	public double getPerim() {
		return a+b+c;
	}

	public double getSquare() {
		return Math.sqrt(getPerim()/2*(getPerim()-a)*(getPerim()-b)*(getPerim()-c));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getA()=" + getA() + ", getB()=" + getB() + ", getC()="
				+ getC() + ", getPerim()=" + getPerim() + ", getSquare()=" + getSquare() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

