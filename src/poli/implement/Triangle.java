package poli.implement;

import poli.interfaises.Shape2D;

public class Triangle implements Shape2D {
	private double a;
	private double b;
	private double c;
	
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	@Override
	public double getPerim() {
		return a+b+c;
	}

	@Override
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
