class Account
{
    int accountNo;
    String holderName;
    float balance;

    // public Account( int accountNo, String holderName) {
    //     this.accountNo=accountNo;
    //     this.holderName=holderName;
    // }

    void print() {

        System.out.println(accountNo);
        System.out.println(holderName);
        System.out.println(balance);
        
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        SavingsAccount s1 = new SavingsAccount();
        SavingsAccount s2 = new SavingsAccount();

        m.add(s1);
        m.add(s2);
        m.add(new CreateAccount());
        m.add(new CreateAccount());
        m.add(new CreateAccount());

        System.out.println(s1.calcYearlyInterest());
        System.out.println(s2.calcYearlyInterest());

        m.print();
        
    }
}

class SavingsAccount extends Account
{
    float interestRate;

    float calcYearlyInterest()
    {
        return balance * interestRate;
    }

    void print()
    {
        super.print();
        System.out.println(interestRate);
    }
}

class CreateAccount extends Account
{
    void print()
    {
        super.print();
    }
}

class Manager
{
    Account ac[] = new Account[1];

    Manager()
    {
        ac[0] = new Account();
    }

    void add(Account x)
    {
        int i, n = ac.length;

        Account np[] = new Account[n + 1];

        for (i = 0; i < n; i++)
            np[i] = ac[i];

        np[n] = x;

        ac = np;
    }

    void print()
    {
        for (int i = 0; i < ac.length; i++)
        {
            ac[i].print();
        }
    }
}