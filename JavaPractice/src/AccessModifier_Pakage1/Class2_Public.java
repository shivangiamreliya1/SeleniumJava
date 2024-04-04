package AccessModifier_Pakage1;

public class Class2_Public {

	public void m1() {
		System.out.println("M1_Public_Clas2");
		m3();
	}

	void m2() {
		System.out.println("M2_Public_Clas2");
		m3();
	}

	private void m3() {
		System.out.println("M3_Public_Clas2");

	}
	
	protected void m4() {
		System.out.println("M4_Public_Clas2");
		m3();
	}

}
