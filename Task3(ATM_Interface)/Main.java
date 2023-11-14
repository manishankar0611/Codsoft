import java.util.Scanner;

class BankAccount{
    private int balance;
    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }
    public int balance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit of " + amount + " Rs was Successful.");
        }
        else{
            System.out.println("Invalid entry!!...please Enter a amount above 0");
        }
    }
    public void Withdrawal(int amount){
        if(amount > 0 && amount <= balance){
            System.out.println("Withdraw Successful of " + amount+ " Rs.");
            balance -= amount;
        }
        else{
            System.out.println("Invalid entry!!.Insufficient balance (or) negative amount entered.");
        }
    }
}
class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }
    public void display(){
        System.out.println("Select Options");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Check Balance");
        System.out.println("4.Quit");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        int Option;
        do{
            display();
            System.out.println("Pick an option");
            Option = sc.nextInt();

            switch(Option){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    account.Withdrawal(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance :"+account.balance());
                    break;
                case 4:
                    System.out.println("Thank You , Visit Again...");
                    break;
                default:
                    System.out.println("Invalid Entry!!... Enter only the given Options");     
            }            
        }while(Option !=4);
        sc.close();
    }
}
public class Main{
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}