package collections.example;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Harry");
		ll.add("Voldemort");
		ll.add("Horocrux");
		ll.add("Lily");
		ll.add("Wand");
		ll.add("Dumbeldore");
		
		System.out.println("Elemnts of the linkedlist: " + ll);
		ll.add(3,"Hermoine");
		
		System.out.println("Elemnts of the linkedlist after adding : " + ll);
		
		ll.remove("Voldemort");
		System.out.println("Elemnts of the linkedlist after removing : " + ll);
		
		System.out.println("Is Horocrux in the linkedlist ? " + ll.contains("Horocrux"));
		
		System.out.println("Size of the linkedlist: " + ll.size());
		
		
		
		
		
		
	}

}
