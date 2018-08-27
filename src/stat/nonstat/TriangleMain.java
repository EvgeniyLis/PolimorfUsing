package stat.nonstat;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle trian1=new Triangle(2, 3);
		Triangle trian2=new Triangle(5, 6);
		Triangle trian3=new Triangle(8, 9);
		Triangle.setC(7);
		System.out.println("Triangle first is "+trian1);
		System.out.println("Triangle second is "+trian2);
		System.out.println("Triangle third is "+trian3);
		trian1.setC(10);
		System.out.println("Triangle first is "+trian1);
		System.out.println("Triangle second is "+trian2);
		System.out.println("Triangle third is "+trian3);
	}

}
