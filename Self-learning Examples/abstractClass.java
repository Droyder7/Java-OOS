class abstractClass {
    public static void main(String[] args) {

        base b1 = new child(); // 1st Base 2nd Child
        b1.show(); //base show
        b1.print(); // base print

        System.out.println();

        child c1 = new child(); // 1st Base 2nd Child
        c1.show();
        c1.print(); //  child print

        base b2 = c1;
        b2.show();
        b2.print(); // child print

        System.out.println();

        ab a1 = new cd();
        a1.a();     // ab
        a1.b();     // cd due to R.T.P
        a1.c();     // cd due to R.T.P

        cd c = new cd();
        c.a();      // ab base class method inherited method
        c.b();      // cd method

        ab a2 = c;
        a2.b();     // cd method

    }
}

interface in {
    default void a() {
    }

    default void b() {
    }

    void c();
}

abstract class ab implements in {
    public void a() {
        System.out.println("a in class ab");
    }
}

class cd extends ab
{
    public void b() {
        System.out.println("b in class cd");
    }

    // public void a() {
    //     System.out.println("a in class cd");
    // }
    
    public void c() {
        System.out.println("c in class cd");
    }
}
abstract class base
{
    base()
    {
        System.out.println("\nBase Const");
    }

    abstract void show();
    
    void print()
    {
        System.out.println("\nBase Print");
    }
}

class child extends base {
    child()
    {
        System.out.println("Child Const\n");
    }

    void show()
    {
        System.out.println("\nChild Show");
    }

    void print()
    {
        super.print();
        System.out.println("Child Print");
    }
}