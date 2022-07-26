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

public class Q4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of gallons of gas in tank: ");
        int gal = sc.nextInt();
        System.out.println("Enter fuel efficiency: ");
        float eff = sc.nextFloat();
        System.out.println("Enter price per gallon: ");
        float price = sc.nextInt();
        float miles = 30*gal*eff;
        float reqPrice =  (price*gal)/100;
        System.out.println("The car can go as far as "+miles+" miles.");
        System.out.println("Price per 100 miles: "+reqPrice);
        
    }
}
