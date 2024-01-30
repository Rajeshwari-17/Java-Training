package Example2;



public class Books implements Comparable<Books>
{

    private String title;
    private int year;

    public Books(String title,int year)
    {
        this.title = title;
        this.year = year;
    }
    
    @Override
    public int compareTo(Books other) {
        return Integer.compare(this.year,other.year);
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}