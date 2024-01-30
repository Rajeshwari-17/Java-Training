package Example2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {
    public static void main(String args[])
    {
        List<Books> library = new ArrayList<>();
        library.add(new Books("Java Programming", 2019));
        library.add(new Books("Algorithms Unleashed", 2022));
        library.add(new Books("Data Structures Explained", 2017));

        Collections.sort(library);

        System.out.println("Books sorted by release year: ");
        for(Books books: library)
        {
            System.out.println(books.getTitle() + " (" + books.getYear() + ")");
        }

        System.out.println();
        System.out.println("Books sorted alphabetically: ");
        Collections.sort(library,new TitleComparator());
        for(Books books: library)
        {
            System.out.println(books.getTitle() + " (" + books.getYear() + ")");
        }
    }
}