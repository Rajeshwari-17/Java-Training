import java.util.*;
import java.util.Scanner;
public class Rotatebyksteps {
    public static void main(String[] args)
    {
        int size,element;
        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            element = sc.nextInt();
            arr[i] = element;
        }
        int temp[] = new int[size];
        int rot;
        rot = sc.nextInt();
        int k=0;
        for(int i=size-rot;i<size;i++)
        {
            temp[k] = arr[i];
            k++;
        }
        k = size-rot;
        for(int i=0;i<size-rot;i++)
        {
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(temp[i]);
        }

    }

    
}
