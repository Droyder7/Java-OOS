class abstractClass {
    public static void main(String[] args) {

        base b1 = new child(); // 1st Base 2nd Child
        b1.show(); //child show R.T.P
        b1.print(); // base print

        System.out.println();

        child c1 = new child(); // 1st Base 2nd Child
        c1.show();
        c1.print(); //  child print

        base b2 = c1;
        b2.show(); //child show R.T.P
        b2.print(); // child print

        System.out.println();

        ab a1 = new cd();
        a1.a();     // ab base class inherited method
        a1.b();     // cd due to R.T.P
        a1.c(); // cd due to R.T.P

        cd c = new cd();
        c.a();      // ab base class inherited method
        c.b(); // cd method
        c.d();

        ab a2 = c;
        a2.b();     // cd method due to R.T.P

    }
}

interface in {
    default void a() {
        System.out.println("\na in interface");
    }

    default void b() {
    }

    void c();
}

interface i {
    default void d() {
        System.out.println("\nd in interface");
    }

    default void show()
    {
        System.out.println("\nChild Show");
    }
}

abstract class ab implements in {
    public void a() { // overriding a of interface
        in.super.a();
        System.out.println("a in class ab");
    }
    public void d() {       // hides d method of interface i when cd extends ab implements i
        System.out.println("\nd in abstractClass");
    }
}

class cd extends ab implements i        // both extends & implements can possible at same time order should be same
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

class child extends base
{
    child()
    {
        System.out.println("Child Const\n");
    }

   public void show()       // hides show method of interface i when any class extends this class & implements interface i having a common method at the same time
    {
        System.out.println("\nChild Show");
    }

    void print()
    {
        super.print();
        System.out.println("Child Print");
    }
}

class grandchild extends child implements i
{

}