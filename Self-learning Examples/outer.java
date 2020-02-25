
class Nested
{
       public static void main() {
        
        outer ob = new outer();

        System.out.println(ob.s);
        ob.show();      // outer show

        outer.inner ib = ob.new inner(); // to create object of inner class
        // type will be outer.inner 
        // new will be object.new

        System.out.println(ib.s);
        ib.show(); // inner show
        
        ob = ib;

        System.out.println("ob = ib");

        System.out.println(ob.s);       // Outer class value due to no R.T.P for variables
        ob.show(); // Inner show due to R.T.P
        
        
        outer o = ob.new inner();
        System.out.println(o.s);    // outer class value
        o.show();                   // inner class show
    }
}

class outer {
    outer()
    {
        System.out.println("\nOuter Const");
    }

     String s = "Outer";

     void show() {
         System.out.println("default Outer Show");
     }
    
    private void print()
     {
         System.out.println("private outer print");
     }

    class inner extends outer {

        inner()
    {
        System.out.println("Inner Const\n");
    }
     String s = "Inner";

      void show() {
         System.out.println("default Inner Show");
     }
        
     void print()
     {
         System.out.println("default inner print");
     }
    } // inner class closed 
    
    public static void main(String[] args) {
        
        outer ob = new outer();

        System.out.println(ob.s);
        ob.show(); // outer show
        ob.print();

        inner ib = ob.new inner(); // to create object of inner class
        // new will be object.new

        System.out.println(ib.s);
        ib.show(); // inner show
        ib.print();

        System.out.println("ob = ib");
        
        ob = ib;

        System.out.println(ob.s);       // Outer class value due to no R.T.P for variables
        ob.show(); //  R.T.P as show is not private in outer
        ob.print(); // no R.T.P as print is private in outer

        outer o = ob.new inner();
        System.out.println(o.s);    // outer class value
        o.show(); // inner class show R.T.P
        o.print();
        
        Nested.main();
        
    }       // main closed

}       // outer class closed