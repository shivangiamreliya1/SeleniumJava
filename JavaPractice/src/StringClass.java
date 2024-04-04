
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String Literal
		
		String S1 = "Hello my name is shivangi";
	    
		//string with object 
		
		String S2 = new String ("Hi Is this app") ;
		
		//if you want to split the character then use below 
		
		String[] Textsplit = S1.split("name");
		
		System.out.println(Textsplit [0]);
		System.out.println(Textsplit [1].trim());
		/*
		 * System.out.println(Textsplit [2].trim()); System.out.println(Textsplit
		 * [3].trim());
		 */
		
		
		//if we have to print the line word by word 
		
		for (int i=S1.length()-1; i<S1.length(); i--)
		{
			System.out.println(S1.charAt(i));
		}
			
	}

}
