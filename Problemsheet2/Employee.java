import java.util.*;

public class Employee 
{
    String name;
    double salary;

    public Employee()
    {
        this.name = "";
        this.salary = 0;
    }
    public Employee(String n,double s )
    {
        this.name = n;
        this.salary = s;
    }
    public String getName()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public String Print()
    {
        return ("Employee name is "+this.getName()+" and salary is "+this.getSalary());
    }

    public static void main(String[] args)
    {
        Employee E1 = new Employee("ABC",123.45);
        System.out.println(E1.Print());
    }
  }
