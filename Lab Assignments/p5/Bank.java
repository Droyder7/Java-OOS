import java.util.Scanner;

class BankAccount
{
    public int AccountNumber;
    public float balance;
    public String ownerName;

    public BankAccount(int x, float balance, String ownerName) {
        AccountNumber = x;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public BankAccount() {
        AccountNumber = 0;
        this.balance = 0;
        this.ownerName = " ";
    }
    
    public void add(int x) {
        balance += x;
    }

    public void subtract(int x) {
        balance -= x;
    }

    public void display() {

        System.out.println("Account Number : " +AccountNumber);
        
        System.out.println("Balance : " + balance);
        
        System.out.println("Owner Name : "+ownerName);
    }
}

class AccountManger {
    BankAccount Accts[];

    Scanner in = new Scanner(System.in);

    public AccountManger(int x) {
        Accts = new BankAccount[x];

        Accts[0] = new BankAccount();
        Accts[1] = new BankAccount();
        Accts[2] = new BankAccount();
        Accts[3] = new BankAccount();
        Accts[4] = new BankAccount();
    }
    
    public void create() {

        System.out.println("Enter Account number to create : ");
        int m=0, n=0;

        n = in.nextInt();
        m = n - 1;

        Accts[m].AccountNumber = n;

        System.out.println("Enter Balance");
        Accts[m].balance = in.nextFloat();

        System.out.println("Enter Owner name : ");
        Accts[m].ownerName = in.next();

    }

    public void delete() {

        System.out.println("Enter the Account Number to delete :");

        int n = in.nextInt();

        Accts[n - 1] = new BankAccount();


    }

    public void deposit() {

        System.out.println("Enter the Account Number to deposit :");

        int n = in.nextInt();

        System.out.println("Enter the Balance to deposit :");

        Accts[n - 1].add(in.nextInt());

    }

    public void withdrawal() {

        System.out.println("Enter the Account Number to withdrawal :");

        int n = in.nextInt();

        System.out.println("Enter the Balance to withdraw :");

        Accts[n - 1].subtract(in.nextInt());

    }

    
}

class Bank {
    public static void main(String[] args) {
        
        AccountManger m = new AccountManger(5);

        m.create();
        m.create();

        for(int i=0; i<m.Accts.length; i++)
        {
            m.Accts[i].display();
        }
        
       
    }
}