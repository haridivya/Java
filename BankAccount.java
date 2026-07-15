
import java.util.*;
class BankAccount
{
    static Scanner sc=new Scanner(System.in);
    int AccountNumber;
    String AccountHolder;
    int  balance;
    public void deposit(int dep){
        balance+=dep;
    }
    public void withDraw(int wd){
        if(balance>wd){
             balance-=wd;
        }
        else{
            System.out.println("Insufficent Balance ");
        }
    }
    public void display(){
        System.out.println(balance);
    }
     BankAccount()   
    {
        System.out.println("Enter The Account Number :");
        AccountNumber=sc.nextInt();
        System.out.println("Enter the Account Holder :");
        AccountHolder=sc.next();
        System.out.println("Enter The Initial Balance");
        balance=sc.nextInt();
        
    }
    public static void main(String args[])
    {
        BankAccount ba = new BankAccount();
        System.out.println("Enter the Amout to Deposit :");
        int dep=sc.nextInt();
        ba.deposit(dep);
        System.out.println("You Need to Display Balance(Yes/No) :");
        String Deptemp=sc.next();
        if(Deptemp.equals("yes"))
        {
            System.out.println("Your Balance after Deposite: ");
            ba.display();
        }
        System.out.println("Enter the Amount to WithDraw :");
        int withDrawAmount=sc.nextInt();
        ba.withDraw(withDrawAmount);
        System.out.println("You Need to Display Balance(Yes/No) :");
        String withtemp=sc.next();
        if(withtemp.equals("yes"))
        {
            System.out.println("Your Balance after WithDraw: ");
            ba.display();
        }
    System.out.println("------------------------Thank You Visit Again---------------------------")
    }            
}

