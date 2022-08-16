package problemsheet4;

/**
 *
 * @author 20pt02
 */
abstract class Books 
{
    String title;
    int dayTaken;
    public abstract int daysOverdue(int d);
    public abstract boolean isOverdue(int d);
    public abstract double computeFine(int d); 
}

class RegularBook extends Books
{
    String author;
    public RegularBook(String t,String a,int d)
    {
        title = t;
        author = a;
        dayTaken = d;
    }
    public int daysOverdue(int today)
    {
        if(!isOverdue(today))
        {
            return 0;
        }
        return (today - dayTaken) - 14;
    }
    public boolean isOverdue(int today)
    {
        return today - dayTaken > 14;
    }
    public double computeFine(int today)
    {
        if(!isOverdue(today))
        {
            return 0;
        }
        else
        {
            return daysOverdue(today)*1;
        }
    }
    
}

class RefBook extends Books
{
    public RefBook(String t,int d)
    {
        title = t;
        dayTaken = d;
    }
    public int daysOverdue(int today)
    {
        if(!isOverdue(today))
        {
            return 0;
        }
        return (today - dayTaken) - 2;
    }
    public boolean isOverdue(int today)
    {
        return today - dayTaken > 2;
    }
    public double computeFine(int today)
    {
        if(!isOverdue(today))
        {
            return 0;
        }
        else
        {
            return daysOverdue(today)*1;
        }
    }  
}

class AudioBook extends Books
{
    String author;
    public AudioBook(String t,String a,int d)
    {
        title = t;
        author = a;
        dayTaken = d;
    }
    public int daysOverdue(int today)
    {
        if(!isOverdue(today))
        {
            return 0;
        }
        return (today - dayTaken) - 14;
    }
    public boolean isOverdue(int today)
    {
        return today - dayTaken > 14;
    }
    public double computeFine(int today)
    {
        if(!isOverdue(today))
        {
            return 0;
        }
        else
        {
            return daysOverdue(today)*2;
        }
    } 
}

public class Book
{
    public static void main(String[] args)
    {
        int today = 28;
        RegularBook B1 = new RegularBook("Famous Five","Enid Blyton",5); 
        System.out.println("Days Overdue: " + B1.daysOverdue(today));
        System.out.println("Fine: Rs " + B1.computeFine(today));
        RefBook B2 = new RefBook("Calculus",13);
        System.out.println("Days Overdue: " + B2.daysOverdue(today));
        System.out.println("Fine: Rs " + B2.computeFine(today));
        AudioBook B3 = new AudioBook("Podcast","Author1",13);
        System.out.println("Days Overdue: " + B3.daysOverdue(today));
        System.out.println("Fine: Rs " + B3.computeFine(today));
    }
}
