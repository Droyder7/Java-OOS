/*
class Nested
{
       public static void main(String[] args) {
        
        outer ob = new outer();

        System.out.println(ob.s);
        ob.show();      // outer show

        outer.inner ib = ob.new inner(); // to create object of inner class
        // type will be outer.inner 
        // new will be object.new

        System.out.println(ib.s);
        ib.show(); // inner show
        
        ob = ib;

        System.out.println(ob.s);       // Outer class value due to no R.T.P for variables
        ob.show(); // Inner show due to R.T.P
        
        outer o = ob.new inner();
        System.out.println(o.s);    // outer class value
        o.show();                   // inner class show
    }
}
*/
class outer {
    outer()
    {
        System.out.println("\nOuter Const");
    }

    private String s = "Outer";

    private void show() {
        System.out.println("Outer Show");
    }

    class inner extends outer {

        inner()
    {
        System.out.println("Inner Const\n");
    }
    private String s = "Inner";

    private void show() {
            System.out.println("Inner Show");
        }
    } // inner class closed 
    
    public static void main(String[] args) {
        
        outer ob = new outer();

        System.out.println(ob.s);
        ob.show();      // outer show

        inner ib = ob.new inner(); // to create object of inner class
        // new will be object.new

        System.out.println(ib.s);
        ib.show(); // inner show
        
        ob = ib;

        System.out.println(ob.s);       // Outer class value due to no R.T.P for variables
        ob.show(); // Outer show due to no R.T.P
        
        outer o = ob.new inner();
        System.out.println(o.s);    // outer class value
        o.show(); // Outer class show no R.T.P
        
    }       // main closed

}       // outer class closed