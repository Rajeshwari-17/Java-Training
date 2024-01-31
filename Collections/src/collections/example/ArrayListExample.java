package collections.example;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args)
	{
		ArrayList<String> Al = new ArrayList<>();
		
		Al.add("Harry");
		Al.add("Voldemort");
		Al.add("Horocrux");
		Al.add("Lily");
		Al.add("Wand");
		Al.add("Dumbeldore");
		
		System.out.println("Elemnts of the arraylist: " + Al);
		Al.add(3,"Hermoine");
		
		System.out.println("Elemnts of the arraylist after adding : " + Al);
		
		Al.remove("Voldemort");
		System.out.println("Elemnts of the arraylist after removing : " + Al);
		
		System.out.println("Is Horocrux in the arraylist ? " + Al.contains("Horocrux"));
		
		System.out.println("Size of the arraylist: " + Al.size());
		
		
		
		
		
		
	}

}
