package poli.main;

import java.util.Scanner;

import poli.implement.Ellips;
import poli.implement.Rectangle;
import poli.implement.Triangle;
import poli.interfaises.Shape2D;

public class PolimorfInterfais {

	//дан массив, одна треть которого занимает треуг, остальные две - прямоуг и эллипс
	//найти фигуру с макс площадью и мин периметром
	
	public static void main(String[] args) {
		Shape2D[] shapes;
		int count;
		System.out.println("Enter size of array");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		shapes=new Shape2D[count];
		int index=1; 
		for (int i = 0; i < shapes.length/3; i++) {
			System.out.println("Enter sides of "+(index++)+" triangle");
			double a=input.nextDouble();
			double b=input.nextDouble();
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
		Shape2D shapeMaxSquare=shapes[0];
		Shape2D shapeMinPerim=shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i].getSquare()>shapeMaxSquare.getSquare()) {
				shapeMaxSquare=shapes[i];
			}
			if (shapes[i].getPerim()<shapeMinPerim.getPerim()) {
				shapeMinPerim=shapes[i];
			}
		}
		System.out.println("Shape with max square is "+shapeMaxSquare);
		System.out.println("Shape with min perim is "+shapeMinPerim);
	}

}
