package poli.main;

import java.util.Scanner;

import poli.implement.Ellips;
import poli.implement.Rectangle;
import poli.implement.Triangle;
import poli.interfaises.Shape2D;

public class Shapes2DSort {

	//отсортировать массив фигур (треуг, прямоуг, эллипс в порядке убывания периметров)
	
	public static void main(String[] args) {
		Shape2D[] shapes;
		Shape2D temp;
		int count;
		System.out.println("Enter the count of shapes");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		shapes=new Shape2D[count];
		int index=1;
		for (int i = 0; i < shapes.length/3; i++) {
			System.out.println("Enter three sides of "+(index++)+" triangle");
			double a=input.nextDouble();
			double b=input.nextInt();
			double c=input.nextDouble();
			shapes[i]=new Triangle(a, b, c);
		}
		index=1;
		for (int i = shapes.length/3; i < shapes.length-shapes.length/3; i++) {
			System.out.println("Enter sides of "+(index++)+" rectangle");
			double a=input.nextDouble();
			double b=input.nextDouble();
			shapes[i]=new Rectangle(a, b);
		}
		index=1;
		for (int i = shapes.length-shapes.length/3; i < shapes.length; i++) {
			System.out.println("Enter axes of "+(index++)+" ellips");
			double a=input.nextDouble();
			double b=input.nextDouble();
			shapes[i]=new Ellips(a, b);
		}
		System.out.println("Source array of shapes is :");
		System.out.println();
		outArray(shapes);
		for (int border = 0; border < shapes.length-1; border++) {
			for (int i = 0; i < shapes.length-border-1; i++) {
				if (shapes[i].getPerim()<shapes[i+1].getPerim()) {
					temp=shapes[i];
					shapes[i]=shapes[i+1];
					shapes[i+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Shapes after sorting perim DOWN is :");
		System.out.println();
		outArray(shapes);
	}
	public static void outArray(Shape2D[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
