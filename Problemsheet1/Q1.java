/*
*Write a unit conversion program using the conversion factors of Table 1.  
*Ask the users from which unit they want to convert (fl.oz, gal, oz, lb, in, ft, mi) and which unit they want to convert to (ml, l, g, kg, mm, cm, m,km). 
*Reject incompatible conversions (such as gal to km). Ask for the value to be converted, then display the result. 
*/

import java.util.*;

public class Q1 {
    
    public static void PrintErrorMessage()
    {
        System.out.println("Error! Incompatible conversion.");
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert from?");
        String a = sc.nextLine();
        System.out.println("Convert to?");
        String b = sc.nextLine();
        System.out.println("Value?");
        double num = sc.nextDouble();
        double val;
        switch (a) {
            case "fl.oz":
            switch (b) 
            {
                case "ml":
                    val = num*29.586;
                    System.out.println(num+" fl.oz = "+val+" ml" );
                    break;
                case "l":
                    val = (num*29.586)/1000;
                    System.out.println(num+" fl.oz = "+val+" l" );
                    break;
                default:
                    PrintErrorMessage();
                    break;
            }
            break;
            case "gal":
            switch (b) {
                case "l":
                    val = 3.785*num;
                    System.out.println(num+" gal = "+val+" l" );
                    break;
                case "ml":
                    val = 3.785*num*1000;
                    System.out.println(num+" gal = "+val+" ml" );
                    break;
                default:
                    PrintErrorMessage();
                    break;
            }
            break;
            case "oz":
            switch (b) {
                case "g":
                    val = num*28.3495;
                    System.out.println(num+" oz = "+val+" g" );
                    break;
                case "kg":
                    val = (num*28.3495)/1000;
                    System.out.println(num+" oz = "+val+" kg" );
                    break;
                default:
                    PrintErrorMessage();
                    break;
            }
    break;
                case "lb":
                    val = num*453.6;
            switch (b) {
                case "g":
                    System.out.println(num+" lb = "+val+" g" );
                    break;
                case "kg":
                    val = val/1000;
                    System.out.println(num+" lb = "+val+" kg" );
                    break;
                default:
                    PrintErrorMessage();
                    break;
            }
    break;
                case "in":
                    val = num*2.54;
                    if(b.equals("cm"))
                    {
                        System.out.println(num+" in = "+val+" cm" );
                    }   if(b.equals("m"))
                    {
                        val = val/100;
                        System.out.println(num+" in = "+val+" m" );
                    }   if(b.equals("km"))
                    {
                        val = val/10000;
                        System.out.println(num+" in = "+val+" km" );
                    }
                    else
                    {
                        PrintErrorMessage();
                    }   break;
                case "ft":
                    val = num*30.5;
            switch (b) {
                case "cm":
                    System.out.println(num+" ft = "+val+" cm" );
                    break;
                case "m":
                    val = val/100;
                    System.out.println(num+" ft = "+val+" m" );
                    break;
                case "km":
                    val = val/10000;
                    System.out.println(num+" ft = "+val+" km" );
                    break;
                default:
                    PrintErrorMessage();
                    break;
            }
    break;
                case "mi":
                    val = 1.609*num;
            switch (b) {
                case "km":
                    System.out.println(num+" mi = "+val+" km" );
                    break;
                case "m":
                    val = val*100;
                    System.out.println(num+" mi = "+val+" m" );
                    break;
                case "mm":
                    val = val*10000;
                    System.out.println(num+" mi = "+val+" mm" );
                    break;
                default:
                    break;
            }
            break;
            default:
                break;
        }
    }
}
