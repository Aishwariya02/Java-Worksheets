/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20pt02
 */
import java.util.Scanner;

class Employee
{
    int age;
    int salary;
    
    Employee()
    {
        age = 0;
        salary = 0;
    }
    Employee(int a,int sal)
    {
        age = a;
        salary = sal;
    }
    void increaseSalary(int salaryIncrease)
    {
        salary *= (1+salaryIncrease);
    }
    boolean checkRetirement()
    {
        if(age > 65)
        {
            return true;
        }
        return false;
    }
    void paySalary(int i)
    {
        System.out.println("The company pays salary to the employee " + i);
    }
    void display()
    {
        System.out.println("Employee age: "+age+"\nEmployee salary: "+salary);
    }
}

class Clerk extends Employee
{
    public int illDays = 0;
    public Clerk(int a,int s,int ill)
    {
        age = a;
        salary = s;
        illDays = ill;
    }
    void addIllDays()
    {
        illDays+=1;
    }
    int getIllDays()
    {
        return illDays;
    }
    void display()
    {
        super.display();
        System.out.println("Illdays: "+illDays);
    }  
}

class Director extends Employee
{
    double gratification = 0;
    public Director(int a,int s,int g)
    {
        age = a;
        salary = s;
        gratification = g;
    }
    void payGratification(int i)
    {
        
    }
    void display()
    {
        super.display();
        System.out.println("Gratification: "+gratification);
    }
}

class Company
{
    static int numberOfEmployees = 0;
    int profit;
    Employee[] employees;
    
    public Company(int maxsize)
    {
        employees = new Employee[maxsize];
    }
    void addClerk(int a,int s,int ill)
    {
        employees[numberOfEmployees] = new Clerk(a,s,ill);
        numberOfEmployees+=1;
    }
    void addDirector(int a,int s,int g)
    {
        employees[numberOfEmployees] = new Director(a,s,g);
        numberOfEmployees+=1;
    }
    void printCompany()
    {
        for(int j = 0;j<numberOfEmployees;j++)
        {
            employees[j].display();   
        }
    }
}

public class CompanyTest 
{
    public static void main(String[] args)
    {
        Company C1 = new Company(15);
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 2;i++)
        {
            int a,s,g;
            System.out.println("Enter age of director:");
            a = sc.nextInt();
            System.out.println("Enter salary of director:");
            s = sc.nextInt();
            System.out.println("Enter gratification:");
            g = sc.nextInt();
            C1.addDirector(a,s,g);    
        }
        for(int i = 0;i < 2; i++)
        {
            int a,s,g;
            System.out.println("Enter age of clerk:");
            a = sc.nextInt();
            System.out.println("Enter salary of clerk:");
            s = sc.nextInt();
            System.out.println("Enter no of ill days:");
            g = sc.nextInt();
            C1.addClerk(a,s,g);
        }
        C1.printCompany();
    }
    
}
