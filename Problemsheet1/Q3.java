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

public class Q3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card: ");
        String card = sc.nextLine();
        String c;
        String c2;
        int x;
        switch(card.charAt(0))
        {
            case 'A' -> c = "Ace";
            case 'J' -> c = "Jack";
            case 'Q' -> c = "Queen";
            case 'K' -> c = "King";
            case '2' -> c = "Two";
            case '3' -> c = "Three";
            case '4' -> c = "Four";
            case '5' -> c = "Five";
            case '6' -> c = "Six";
            case '7' -> c = "Seven";
            case '8' -> c = "Eight";
            case '9' -> c = "Nine";
            case '1' -> c = "Ten";
            default -> c = "Invalid";
                
        }
        if(card.charAt(1) == '0')
        {
            x = 2;
        }
        else
        {
            x = 1;
        }
        switch(card.charAt(x))
        {
            case 'S' -> c2 = "Spades";
            case 'D' -> c2 = "Diamonds";
            case 'H' -> c2 = "Hearts";
            case 'C' -> c2 = "Clubs";
            default -> c2 = "Invalid";
        }   
        System.out.println(c + " of " + c2);
    }
    
}
