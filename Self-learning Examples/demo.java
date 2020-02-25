/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        base c = new child();

        c.print();
    }
}

interface ig // Grand Parent Interface
{
    default void print() //default print method with body which is need not to override further 
    {
        System.out.println("\nPrint in ig");
    }

}

interface i1 extends ig
{
    //@Override
    // default void print() {
    //     ig.super.print();
    //     System.out.println("\nPrint in i1");
    // }

    void print();
}

class grand implements i1 {
    void show() {
        System.out.println("grand");
    }

    public void print() {
        System.out.println("print in grand");
    }
}

class base extends grand
{
    void show()
    {
        System.out.println("base");
    }

    void fun()
    {
        show();
    }
}

class child extends base {
    void show() {
        System.out.println("child");
    }

    void fun()
    {
        show();
    }
}