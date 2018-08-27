package poli.main;

import java.util.Scanner;

import poli.abstractclasses.Shape3D;
import poli.extend.CircleCylindr;
import poli.extend.Parallelep;
import poli.implement.Triangle;

public class Shapes3DMinMax {
	
	//для массива фигур Shapes3D найти фигуру с мин. объемом и макс. площ. поверхности

	public static void main(String[] args) {
		Shape3D[] shapes;
		int count;
		System.out.println("Enter the size of array of shapes");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		shapes=new Shape3D[count];
		int index=1;
		for (int i = 0; i < shapes.length/2; i++) {
			System.out.println("Enter height and radius of "+(index++)+" cylindr");
			double height=input.nextDouble();
			double radius=input.nextDouble();
			shapes[i]=new CircleCylindr(height, radius);
		}
		index=1;
		for (int i = shapes.length/2; i < shapes.length; i++) {
			System.out.println("Enter height and a, b of "+(index++)+" parallelep");
			double height=input.nextDouble();
			double a=input.nextDouble();
			double b=input.nextDouble();
			shapes[i]=new Parallelep(height, a, b);
		}
		Shape3D shapeMinVolume=shapes[0];
		Shape3D shapeMaxSurface=shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i].getVolume()<shapeMinVolume.getVolume()) {
				shapeMinVolume=shapes[i];
			}
			if (shapes[i].getSurface()>shapeMaxSurface.getSurface()) {
				shapeMaxSurface=shapes[i];
			}
		}
		System.out.println("Source array of shapes is :");
		outArray(shapes);
		System.out.println("Shape with min volume is : "+shapeMinVolume);
		System.out.println("Shape with max surface is: "+shapeMaxSurface);
		
	}
	public static void outArray(Shape3D[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
