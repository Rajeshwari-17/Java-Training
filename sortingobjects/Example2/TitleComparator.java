package Example2;


import java.util.Comparator;

public class TitleComparator implements Comparator<Books>
{
    @Override
    public int compare(Books b1,Books b2)
    {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}