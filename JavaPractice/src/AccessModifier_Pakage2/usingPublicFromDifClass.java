package AccessModifier_Pakage2;

import AccessModifier_Pakage1.Class2_Public;

public class usingPublicFromDifClass extends Class2_Public {

	public static void main(String[] args) {
		
		Class2_Public CP = new Class2_Public();
		CP.m1();
	    //CP.m4();
		
		usingPublicFromDifClass UM = new usingPublicFromDifClass();
		UM.m4();
	
	}

}
