package set.example;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class SetExample {
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("Harry Potter");
		set.add("Ron");
		set.add("Hermoine");
		set.add("Ginny");
		set.add("Nivelle");
		
		System.out.println("Set elements : " + set);
		boolean containsHermoine = set.contains("Hermoine");
		 System.out.println("Set contains Hermoine: " + containsHermoine);

	        // Removing an element
	        set.remove("Ron");

	        // Displaying the set after removal
	        System.out.println("Set after removing Ron: " + set);

	        // Iterating through the set using Iterator
	        System.out.println("Iterating through the set:");
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Clearing the set
	        set.clear();

	        // Displaying the set after clearing
	        System.out.println("Set after clearing: " + set);




		
	}

}
