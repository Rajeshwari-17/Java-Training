package hashing.example;
import java.util.HashSet;
public class HashsetExam {
	public static void main(String[] args)
	{
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");

        hashSet.add("Orange");

        hashSet.add("Grapes");

        hashSet.add("Berries");
        System.out.println("Hashset " + hashSet);
        boolean containBanana = hashSet.contains("Banana");
        System.out.println("conatins Banana " + containBanana);
        
        hashSet.remove("Orange");
        System.out.println("New Hash set " + hashSet);
        boolean containOrange = hashSet.contains("Orange");
        System.out.println("conatins Orange " + containOrange);
        
        hashSet.clear();
        System.out.println("After clearning the hashset " + hashSet);
        

        

	}

}
