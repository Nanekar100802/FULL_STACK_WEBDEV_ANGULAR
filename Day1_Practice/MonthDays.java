import java.util.Scanner;
public class MonthDays
{
    public static void main(String args[])
    {
        char january=31,march=31,may=31,july=31,august=31,october=31,december=31,feb=28,april=30,june=30,september=30,november=30,month;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month of which days you want to find: ");
        month=sc.next().charAt(0);
        if(month==january||month==march||month==may||month==july||month==august||month==october||month==december)
        {
            System.out.print("Number of Days in month is 31");   
        }
        else if(month==april||month==june||month==september||month==november)
        {
            System.out.print("Number of Days in month is 30");   
        }
        else
        {
           System.out.print("Number of Days in month is 28 or 29");  
        }
    }
}