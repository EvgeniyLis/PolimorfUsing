package poli.main;

import java.util.Scanner;

import poli.abstractclasses.Shape3D;
import poli.extend.CircleCylindr;
import poli.extend.Parallelep;

public class SortPolimorfism {

	//отсортировать массив трехмерных фигур в порядке возрастания объемов, в котором половина Цилиндров и половина Паралл-ов
	public static void outArray(Shape3D[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Shape3D[] shapes;
		Shape3D temp;
		int count;
		System.out.println("Enter the count of array");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		shapes=new Shape3D[count];
		int index=1;
		for (int i = 0; i < shapes.length/2; i++) {
			System.out.println("Enter height and radius of "+(index++)+" cylindr");
			double radius=input.nextDouble();
			double height=input.nextDouble();
			shapes[i]=new CircleCylindr(height, radius);
		}
		index=1;
		for (int i = shapes.length/2; i < shapes.length; i++) {
			System.out.println("Enter a, b, and height of "+(index++)+" parallelep");
			double a=input.nextDouble();
			double b=input.nextDouble();
			double height=input.nextDouble();
			shapes[i]=new Parallelep(height, a, b);
		}
		System.out.println("Array before sorting is :");
		outArray(shapes);
		for (int border = 0; border < shapes.length-1; border++) {
			for (int i = 0; i < shapes.length-border-1; i++) {
				if (shapes[i].getVolume()>shapes[i+1].getVolume()) {
					temp=shapes[i];
					shapes[i]=shapes[i+1];
					shapes[i+1]=temp;
				}
			}
		}
		System.out.println("Array of shapes after sorting volume Up :");
		outArray(shapes);
	}

}
