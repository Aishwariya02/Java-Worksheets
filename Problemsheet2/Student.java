/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20pt02
 */
import java.util.*;

public class Student 
{
    String name;
    int quizScore;
    int count = 1;
    
    public Student()
    {
        this.name = "";
        this.quizScore = 0;
    }
    
    public Student(String n,int q)
    {
        this.name = n;
        this.quizScore = q;
    }
    public String getName()
    {
        return this.name;
    }
    public void addQuiz(int score)
    {
        this.quizScore += score;
        count++;
    } 
    public int getTotalScore()
    {
        return this.quizScore;
    }
    public float getAverageScore()
    {
        return (this.quizScore)/count;
    }
    public static void main(String[] args)
    {
        Student S1 = new Student("Conrad",20);
        S1.addQuiz(30);
        S1.addQuiz(5);
        System.out.println("Total score: "+S1.getTotalScore());
        System.out.println("Average score = "+S1.getAverageScore());
        System.out.println("No of quiz games = "+S1.count);
    }
    
}
