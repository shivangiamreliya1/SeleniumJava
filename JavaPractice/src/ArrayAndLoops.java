import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndLoops {

	public static void main(String[] args) {
		//static Array 
		int arr[] = {1,2,3,4,5};
		
		// or we can write like :
		
		// int[] arr1 = {1,2,3,4,5};
		
		System.out.println(arr[3]);

		for (int i=0 ; i< arr.length;  i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name = {"tree", "Plants", "tree2"};
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		 
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0 ; i<arr2.length; i++)			
		{		
			//if (arr2[i] == i*2)-------- Not correct 
			if (arr2[i] % 2 == 0)
		   {	
			System.out.println(arr2[i]);
		    }
			else 
			{
				System.out.println(arr2[i] +"  is not out");
			}
			
        
		
     	}

		
		//Dynamic Array ------- in the real time we can go for array list 
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Shivangi");
		a.add("Rahul");
		a.add("Ashu");
		
		System.out.println(a.get(2));
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}	
		System.out.println("********************");
		
		//Contains check whether the value is present in the Arry List or Not
		System.out.println(a.contains("shivi"));	
		
		
		//Que : How to convert Array to Array List 
		String[] name1 = {"tree", "Plants", "tree2"};
		List<String> nameArrayList = Arrays.asList(name1);
		
		System.out.println(nameArrayList.contains("shivi"));
			
		int []	Number = {1,2,3,4,5,6};
		
		List<int[]> NumberList = Arrays.asList(Number);
		
		System.out.println(NumberList.contains(1));
			
}}
