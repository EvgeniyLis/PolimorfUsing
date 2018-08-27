package poli.extend;

import poli.abstractclasses.Shape3D;

public class CircleCylindr extends Shape3D {
	private double radius;
	
	public CircleCylindr(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerim() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getSquare() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "CircleCylindr [radius=" + radius + ", height=" + super.getHeight() + "]"+" with surface "+getSurface()+" and volume "+getVolume();
	}

}
