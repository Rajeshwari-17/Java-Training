import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom class representing an object
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortingObjectsExample {
    public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Alice", 22));
        persons.add(new Person("Bob", 30));

        // Sorting the list based on the 'age' property
        Collections.sort(persons, Comparator.comparingInt(person -> person.age));

        // Printing the sorted list
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
