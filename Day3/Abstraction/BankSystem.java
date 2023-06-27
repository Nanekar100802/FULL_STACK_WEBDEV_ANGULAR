abstract class BankAccount
{
    abstract void withdraw();
    abstract void deposit();
} 
class SavingAc extends BankAccount
{
    void deposit()
    {
     System.out.println("Deposited ammount in Saving account is 5lakh");
    }
    void withdraw()
    {
     System.out.println("Withdrawl ammount from Saving account is 1lakh");
    }
}
class CurrentAc extends BankAccount
{
    void deposit()
    {
     System.out.println("Deposited ammount in Current account is 50lakh");
    }
    void withdraw()
    {
     System.out.println("Withdrawl ammount from Current account is 5lakh");
    }
}
public class BankSystem {
    public static void main(String args[])
    {
        CurrentAc ob=new CurrentAc();
        ob.deposit();
        SavingAc ob2=new SavingAc();
        ob2.withdraw();
        
    }
}
