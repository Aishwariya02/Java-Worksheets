import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();
        String fortune;
        switch(sign)
        {
            case "Aries" -> fortune = "The only trip you will regret is the one you don’t take." ;
            case "Taurus" -> fortune = "Life begins at the end of your comfort zone." ;
            case "Gemini" -> fortune = "Free spirits don't ask for permission.";
            case "Cancer" -> fortune = "Empty yourself and let the universe fill you.";
            case "Leo" -> fortune = "Fall seven times, stand up eight.";
            case "Virgo" -> fortune = "Faith is about doing. You are how you act, not just how you believe.";
            case "Libra" -> fortune = "Everything in the universe is within you. Ask all from yourself.";
            case "Scorpio" -> fortune = "Never regret the decisions we are forced to make, for they will push us forward to a better life.";
            case "Sagittarius" -> fortune = "Stop worrying about what can go wrong, and get excited about what can go right.";
            case "Capricorn" -> fortune = "Learn as much from joy as you do from pain.";
            case "Aquarius" -> fortune = "Trust yourself enough to say no when something's not right and yes when it most definitely is.";
            case "Pisces" -> fortune = "Make more time for things that matter.";
            default -> fortune = "Invalid zodiac sign entered.";
        }
        System.out.println("Your fortune is: " + fortune);
    }
}
