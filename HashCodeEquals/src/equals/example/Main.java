package equals.example;
import java.util.HashMap;
public class Main {
	public static void main(String[] args)
	{
		HashMap<Employee,String> emp = new HashMap<>();
		Employee emp1 = new Employee("John","developer",23,50000);
		Employee emp2 = new Employee("Johny","manger",45,500000);
		emp.put(emp1, "John details");
		emp.put(emp2, "Johny details");
		System.out.println(emp1);
		System.out.println(emp2);
		Employee emp3 = new Employee("John","developer",23,50000);
		System.out.println(emp.get(emp3));

		

	}

}
