package stat.nonstat;


public class Test {
	public static void getStatic() {
		System.out.println("I am static");
	}
	
	public void getNonStatic() {
		System.out.println("I am non static");
	}
	
	public static void main(String[] args) {
		getStatic();
		Test test=new Test();
		test.getNonStatic();
	}
	
}

