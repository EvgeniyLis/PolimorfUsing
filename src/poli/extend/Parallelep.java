package poli.extend;

import poli.abstractclasses.Shape3D;

public class Parallelep extends Shape3D {
	private double a;
	private double b;
	
	public Parallelep(double height, double a, double b) {
		super(height);
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
		return "Parallelep [a=" + a + ", b=" + b + ", height=" + super.getHeight() + "]"+" with surface "+getSurface()+" and volume "+getVolume();
	}

}
