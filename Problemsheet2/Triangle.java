/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20pt02
 */

public class Triangle
{
    double a;
    double b;
    double c;
    double area;
    String color;
    
    public Triangle()
    {
        a = 1;
        b = 1;
        c = 1;
        color = "White"; 
    }
    
    public Triangle(int x,int y,int z)
    {
        a = x;
        b = y;
        c = z;
        color = "White";
    }
    
    public Triangle(Triangle temp)
    {
        a = temp.a;
        b = temp.b;
        c = temp.c;
        area = temp.area;
        color = temp.color;
    }
    
    public void set_length(double l)
    {
        a = l;
    }
    
    public void set_width(double w)
    {
        b = w;
    }
    
    public void set_color(String c)
    {
        color = c;
    }
    
    public void find_area()
    {
        area = 1/2*a*b;
    }
    
    public boolean isTriangle()
    {
        if(a+b > c)
        {
            return true;
        }
        return false;
    }
    
    public boolean isRight()
    {
        if(isTriangle() == true && a*a + b*b == c*c )
        {
            return true;
        } 
        return false;
    }
    
    public boolean isIsosceles()
    {
        if(isTriangle() == true && (a==b || b==c || a==c))
        {
            return true;
        }
        return false;
    }
    
    public boolean isScalene()
    {
        if(isTriangle() == true && (a!=b && b!=c && a!=c))
        {
            return true;
        }
        return false;
    }
    
    public boolean isEquilateral()
    {
        if(isTriangle() == true && (a==b && b==c && a==c))
        {
            return true;
        }
        return false;
    }
    
    public boolean Compare(Triangle T1)
    {
        if(area == T1.area && color == T1.color)
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Triangle T1 = new Triangle(2,2,2);
        Triangle T2 = new Triangle(1,2,3);
        T1.set_color("Purple");
        T1.find_area();
        T2.set_color("Pink");
        T2.find_area();
        if(T1.isRight())
        {
            System.out.println("This is a right triangle.");
        }
        else
        {
            System.out.println("This is not a right triangle");
        }
        if(T1.isIsosceles())
        {
            System.out.println("This is a Isosceles triangle.");
        }
        else
        {
            System.out.println("This is not a Isosceles triangle");
        }
        if(T2.isScalene())
        {
            System.out.println("This is a Scalene triangle.");
        }
        else
        {
            System.out.println("This is not a Scalene triangle");
        }
        
    }
    
    
            
}