package OOps;

abstract public class AbstractFirstP {

	int a;
	String s;
	double b;
	
	final int o = 10;
	
	final void finalTest() {
		
		System.out.println("Final Test ");
	}

	public AbstractFirstP() {
		System.out.println("This is a default 1 constructor");
	}

	public AbstractFirstP(int a, String s, double b) {
		System.out.println("This is a default 2 constructor");
		this.a = a;
		this.s = s;
		this.b = b;
	}

	abstract void Ab1();

	public void Ab2() {

		System.out.println("Ab2");
	}

	public void Ab2(int x, int y, double z) {

		System.out.println("Ab2");
		System.out.println(x + y + z);
	}
	
	public void Ab3 () {
		
		System.out.println("Override - allways override in a child class");		
	}
	
	

}
