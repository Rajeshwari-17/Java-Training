package collections.example;
import java.util.Vector;
import java.util.Enumeration;
public class VectorExample {
	public static void main(String[] args)
	{
		Vector<String> vector = new Vector<>();
		// Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Displaying elements
        System.out.println("Vector: " + vector);

        // Adding elements at specific positions
        vector.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + vector);

        // Getting element at index
        System.out.println("Element at index 2: " + vector.get(2));

        // Checking if an element exists
        System.out.println("Does Banana exist? " + vector.contains("Banana"));

        // Getting the size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        // Enumerating elements
        System.out.println("Enumerating elements:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        // Clearing the Vector
        vector.clear();
        System.out.println("\nAfter clearing the Vector: " + vector);
	}

}
