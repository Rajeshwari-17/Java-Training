package hashing.example;
import java.util.HashMap;
public class HashmapExam {
	public static void main(String[] args)
	{
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Rahul", 10);
        hashMap.put("Ravi", 11);
        hashMap.put("Pinky", 14);
        hashMap.put("Sanju", 9);
        hashMap.put("Tony", 11);
        
        System.out.println("Age of pinky " + hashMap.get("Pinky"));
        //Contains the key 
        System.out.println("Contains key 'Alice': " + hashMap.containsKey("Alice"));
        
        System.out.println("Contains key 'Ravi': " + hashMap.containsKey("Ravi"));
        
        System.out.println("contains vale 10 " + hashMap.containsValue(10));
        
        System.out.println("Contains value 8 " + hashMap.containsValue(8));
        
        hashMap.remove("Tony");
        hashMap.remove("Charlie");
        
        System.out.println("Iterating through the hashmap ");
        for(String key : hashMap.keySet())
        {
        	System.out.println(key + ":" + hashMap.get(key));
        }
        
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);



      
        
        
        

	}
	

}
