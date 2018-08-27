package poli.implement;

import poli.interfaises.Shape2D;

public class Ellips implements Shape2D {
	private double a;
	private double b;
	
	public Ellips(double a, double b) {
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
		return (a+b)/2*Math.PI;
	}

	@Override
	public double getSquare() {
		return Math.PI*a*b;
	}

	@Override
	public String toString() {
		return "Ellips [a=" + a + ", b=" + b + ", getA()=" + getA() + ", getB()=" + getB() + ", getPerim()="
				+ getPerim() + ", getSquare()=" + getSquare() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
