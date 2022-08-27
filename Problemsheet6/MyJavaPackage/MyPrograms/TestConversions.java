package MyJavaPackage.MyPrograms;
import MyJavaPackage.MyConversion.Conversion;
import java.util.*;

public class TestConversions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Conversions: \n1)Inches to centimetres\n2)Cm to Inches\n" +
                "3)Pounds to Kgs\n4)Kgs to Pounds\n5)Miles to Kilometres\n6)Minutes to Hours\n7)Minutes To Seconds\n" +
                "8)Fahrenheit to Celsius\n9)Celsius to Fahrenheit\n10)Quit");
        while(true)
        {
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            if(choice == 10)
                break;
            System.out.println("Enter value to be converted:");
            double n = sc.nextDouble();
            Conversion C1 = new Conversion(n);
            switch(choice)
            {
                case 1:
                    System.out.println(n + " inches = " + C1.ConvertInchesToCentimetres() + " centimetres" );
                    break;
                case 2:
                    System.out.println(n + " centimetres = " + C1.ConvertCentimetresToInches() + " inches" );
                    break;
                case 3:
                    System.out.println(n + " Pounds = " + C1.ConvertPoundsToKilograms() + " Kilograms");
                    break;
                case 4:
                    System.out.println(n + " Kilograms = " + C1.ConvertKilogramsToPounds() + " Pounds");
                    break;
                case 5:
                    System.out.println(n + "miles = " + C1.ConvertMilesToKilometres() + "kilometres");
                    break;
                case 6:
                    System.out.println(n + " minutes = " + C1.ConvertMinutesToHours() + " hours");
                    break;
                case 7:
                    System.out.println(n + " minutes = " + C1.ConvertMinutesToSeconds() + " seconds");
                    break;
                case 8:
                    System.out.println(n + " fahrenheit = " + C1.ConvertFahrenheitToCelsius() + " celsius");
                    break;
                case 9:
                    System.out.println(n + " celsius = " + C1.ConvertCelsiusToFahrenheit() + " Fahrenheit");
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
        //System.out.println("Exit");
    }
}
