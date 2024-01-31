package arraylist.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class FileToArrayList {
	public static void main(String[] args)
	{
		String filepath = "C:/Users/Admin/Downloads/Sampledata.txt";
		List<String> lines = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
			String line;
			while((line = br.readLine())!=null)
			{
				lines.add(line);
				
			}
		}
		    catch(IOException e)
			{
				e.printStackTrace();
			}
		System.out.println("Contents of the Array List");
		for(String content : lines)

		{
			System.out.println(content);
		}
	}

}
