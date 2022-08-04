class Account
{
  double balance;

  public Account()
  {
      balance = 0;
  }
  public Account(double bal)
  {
      balance = bal;
  }

  public void deposit(double amt)
  {
      balance += amt;
  }

  public void withdraw(double amt)
  {
      if(balance > amt)
      {
          balance -= amt;
      }
      else
      {
          System.out.println("Insufficient balance.");
      }
  }
}

class SavingsAccount extends Account
{
    double defaultInterestRate = 2.5;
    double interestRate;

    public SavingsAccount()
    {
        interestRate = 10;
    }

    public SavingsAccount(double rate)
    {
        interestRate = rate;
    }      

    void setDefaultInterestRate(double rate)
    {
        defaultInterestRate = rate;
    }

    void applyMonthlyInterest()
    {
        double monthlyInterest = interestRate/12;
        balance += balance*monthlyInterest;
    }
    public String toString()
    {
        return "Balance: " + this.balance +"\nDefault Interest rate:"
                + this.defaultInterestRate;

    }
}

public class BankAccount
{
  public static void main(String[] args)
  {
      Account A2 = new Account(5000);
      SavingsAccount S1 = new SavingsAccount();
      S1.deposit(5000);
      A2.withdraw(2500);
      S1.setDefaultInterestRate(7.5);
      S1.applyMonthlyInterest();
      System.out.println(S1);
  }
    }
