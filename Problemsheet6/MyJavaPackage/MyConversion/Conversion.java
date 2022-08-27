package MyJavaPackage.MyConversion;

public class Conversion
{
    double num,converted;
    public Conversion(double n)
    {
        num = n;
    }
    public double ConvertInchesToCentimetres()
    {
        return num*2.54;
    }
    public double ConvertCentimetresToInches()
    {
        return num/2.54;
    }
    public double ConvertKilogramsToPounds()
    {
        return num*2.20462;
    }
    public double ConvertPoundsToKilograms()
    {
        return num/2.20462;
    }
    public double ConvertMilesToKilometres()
    {
        return num*1.609344;
    }
    public double ConvertMinutesToHours()
    {
        return num/60;
    }
    public double ConvertMinutesToSeconds()
    {
        return num*60;
    }
    public double ConvertCelsiusToFahrenheit()
    {
        return num*33.8;
    }
    public double ConvertFahrenheitToCelsius()
    {
        return num/33.8;
    }
}
