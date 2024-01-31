package hashing.example;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
public class SetOperations {
	public static void main(String[] args)
	{
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        
        set1.addAll(set2);
        System.out.println("After Adding : " + set1);
        
        Set<Integer> set3 = new HashSet<>(Arrays.asList(4, 5, 6));
        
        set1.retainAll(set3);
        System.out.println("After retaining " + set1);
        
        Set<Integer> set4 = new HashSet<>(Arrays.asList(5, 6, 7));
        
        set1.removeAll(set4);
        System.out.println("After retaining " + set1);



	}

}
