class inheritance {
    public static void main(String[] args) {

        parent p = new parent(1);
        p.show();                   // Parent Show
        System.out.println(p.val);      // will print the calling objects data member irrespective of the object it is referencing
        p.fun(3);

        System.out.println();

        p = new child(2);
        System.out.println(p.val);   // member variable always refers to the calling object class
        p.show();           // Child Show due to run time polymorphism because reference variable contains child object

        System.out.println();
        
        child c = new child(3);
        System.out.println(c.val);
        c.fun(4);

        System.out.println();

        parent pr[] = new parent[2];

        pr[0] = new parent();            // 1st Base 2nd Child
        pr[0].show();       // parent show

        pr[1] = new child();
        pr[1].show();       // child show

        System.out.println();

        grandParent g = new grandParent(4);
        System.out.println(g.val);
        g.show();

        System.out.println();

        g = new parent();
        System.out.println(g.val);      // always print the value in calling object class
        g.show();                       // parent show due to R.T.P

        System.out.println();

        g = new child();
        System.out.println(g.val);
        g.show();                       // child show due to R.T.P
    }
}

class grandParent
{
    int val = 5;
    grandParent(int x)
    {
        System.out.println("GrandParent Para Const");
    }
    void show()
    {
        System.out.println("Show In Grand Parent");
    }
}

class parent extends grandParent
{
    int val = 10;

    parent()
    {
        super(3);
        System.out.println("Parent Const");
    }

    parent(int x)
    {
        super(4);       // have to call para const of parent explicitly otherwise it will try to call default parent constructor which is not defined in parent 
        System.out.println("Parent Para Const");
    }

    protected int fun(int x)
    {
        System.out.println("Parent int Fun");
        return x;
    }

    final void print() {

    }
    
    void show()
    {
        System.out.println("Show In Parent");
    }
}

class child extends parent {

    int val = 20;

    child() {
        System.out.println("Child Const");
    }

    child(int x)
    {
        super(x);       // used to call parent constructor otherwise it will default constructor implicitly
        System.out.println("Child Para Const : "+x);
    }

    void show() {

        super.show(); // calling parent class method

        // cant call print method because it is final

        System.out.println("Show In Child");

    }

    public int fun(int x)   // here fun is overridden ps: visibility cannot be reduced
    {
        System.out.println("Child int Fun : "+x);
        fun(4.5);
        return x;
    }

    private double fun(Double x)     // here fun is overloaded ps: visibility can be reduced
    {
        System.out.println("Child double Fun : "+x);
        return x;
    }
    
}