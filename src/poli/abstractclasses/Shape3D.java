package poli.abstractclasses;

public abstract class Shape3D {
	private double height;

	public Shape3D(double height) {
		super();
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	abstract public double getPerim();
	abstract public double getSquare();
	public double getSurface() {
		return 2*getSquare()+getPerim()*height;
	}
	public double getVolume() {
		return getSquare()*height;
	}
}
