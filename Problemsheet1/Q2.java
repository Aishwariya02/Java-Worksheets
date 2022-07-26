/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author 20pt02
 */
public class Q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade:");
        String grade = sc.nextLine();
        Dictionary grades = new Hashtable();
        grades.put("A+",4.3);
        grades.put("A-",3.7);
        grades.put("B+",3.3);
        grades.put("B-",2.7);
        grades.put("C+",2.3);
        grades.put("C-",1.7);
        grades.put("D+",1.3);
        grades.put("D-",0.7);
        grades.put("F",0);
        
        System.out.println("Corresponding number grade: " + grades.get(grade));
    }
    
}
