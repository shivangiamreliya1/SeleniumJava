public class Car1 implements Class1, Car3 {
	
	public static void main(String[] args) {
		Class1 a = new Car1();
		a.changeG();
		a.applyBreakes();
		a.speedUP();
		
		Car1 b = new Car1();
		b.insideClass();
		
		
		Car3 c = new Car1 ();
		c.method1();
		c.method2();
		 
		Class1 d = new Car1 ();
		d.add(2, 2, 3, 4);
		d.Mob3(3, 4);
		
		
		Class1.method3Rules(0, 0);
		
		
		
}
	
	
	

	@Override
	public void changeG() {
		System.out.println("changeG");
	
		 
	}

	@Override
	public void speedUP() {
		System.out.println("speedUP");
		
	}

	@Override
	public void applyBreakes() {
System.out.println("applyBreakes");
		
	}
        
	
	public void insideClass () {
		System.out.println("insideClass");
	}

	@Override
	public void method1() {
	System.out.println("method1");
		
	}

	@Override
	public void method2() {
	System.out.println("method2");
		
	}

	@Override
	public void Mob3(int l, int s) {
		System.out.println(l + s);
		
	}
	  
}
	

