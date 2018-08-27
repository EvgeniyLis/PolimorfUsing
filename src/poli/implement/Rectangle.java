package poli.implement;

import poli.interfaises.Shape2D;

public class Rectangle implements Shape2D {
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getPerim() {
		return 2*(a+b);
	}

	@Override
	public double getSquare() {
		return a*b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", getA()=" + getA() + ", getB()=" + getB() + ", getPerim()="
				+ getPerim() + ", getSquare()=" + getSquare() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
