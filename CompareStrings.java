import java.util.Scanner;
public class CompareStrings{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String style1 = sc.nextLine();
        String style2 = sc.nextLine();
        if(style1.equals(style2))
        {
            System.out.println("1");
        }
        else 
        System.out.println("0");


    }
}