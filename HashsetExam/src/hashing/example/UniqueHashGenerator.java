package hashing.example;
import java.util.UUID;
public class UniqueHashGenerator {
	public static void main(String[] args)
	{
		UUID uniquekey = UUID.randomUUID();
		System.out.println("UUID : " + uniquekey);
	}

}
