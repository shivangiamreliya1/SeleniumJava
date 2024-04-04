package OOps;

public interface InterfaceFirstProgram {

 public int i = 10;
 String s = "ABC";
 double d = 10.12;
 static String a = "Test";
 
	
 public void daal ();
 
 abstract void daa3 ();
 
 public static void rice () {
	 System.out.println("Static method allways need implement");
	 palakPaneer();
	 }
 
 default void salad () {
	 System.out.println("Either it is public or default");
	 rajma();
	 palakPaneer();
 }
 
 private static void palakPaneer () {
	 System.out.println("Palakpaneer");
	 //Encapsulation 
 }
 
 private void rajma() {
	 System.out.println("rajma");
	//Encapsulation 
 }
 



}
