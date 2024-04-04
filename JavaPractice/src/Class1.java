
interface Class1
{
  	
	void changeG ();
	void speedUP ();
	void applyBreakes ();
	
	int i = 10;
	
	static void method3Rules (int q, int w)
	{
	       System.out.print("No Overspeed");
	       Mob2(q, w);
	}
	
	public default void add (int a, int b, int o, int j ) {
		Mob1(a, b);
		Mob2(o, j);
	}
	
	private void Mob1 (int a, int b) {
		
		System.out.println(a - b);
		Mob2(a, b);		
	}
	
   private static void Mob2 (int o, int k) {
		
		System.out.println(o + k);
				
	}
   
   public abstract void Mob3 (int l, int s);
	
   }


