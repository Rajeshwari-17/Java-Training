package equals.example;

public class Employee {
	private String name;
	private String designation;
	private int age;
	private double salary;
	public Employee()
	{
		
	}
	public Employee(String name,String designation, int age, double salary)
	{
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }

    @Override
    public int hashCode()
    {
        final int prime = 33;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + (designation == null ? 0 : designation.hashCode());
        result = (int) (prime * result + salary);
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return false;
        }
        if(obj instanceof Employee && this == obj)
        {
            return true;
        }

        Employee emp = (Employee) obj;

        if(age != emp.age)
        {
            return false;
        }
        if(name != null && !name.equalsIgnoreCase(emp.name))
        {
            return false;
        }
        if(salary != emp.salary)
        {
            return false;
        }
        if(designation != null && !designation.equalsIgnoreCase(emp.designation))
        {
            return false;
        }
        return true;
    }

	
 

}
