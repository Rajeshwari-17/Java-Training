package dataextraction.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumericDataExtractor {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		String filepath = "C:/Users/Admin/Downloads/archive/Iris.csv";
		ArrayList<Double> numericvalues = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			String line;
			String regex = "[-+]?[0-9]*\\.?[0-9]+";
			Pattern pattern = Pattern.compile(regex);
			
			while((line = reader.readLine())!=null)
			{
				Matcher matcher = pattern.matcher(line);
				while(matcher.find())
				{
					numericvalues.add(Double.parseDouble(matcher.group()));
					
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Numeric values from the Iris Dataset : ");
		for(Double value : numericvalues)
		{
			System.out.println(value);
		}
	}

}
