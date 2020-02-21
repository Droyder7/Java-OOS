// Diamond Problem
interface ig        // Grand Parent Interface
{
    default void print()        //default print method which is need not to override further 
    {
        System.out.println("\nPrint in ig");
    }

    void abstractPrint(); // Abstract method which is to be defined only in child class
                          // An Abstract method cannot be defined in any interface
}

interface i1 extends ig
{
    default void show()     //access modifier should be private or default if we want to define a body otherwise it will be an abstract method
    {
        System.out.println("default show in i1");       // default show in i1
    }

    void abstractMethod();

    default void defaultMethod()
    {
        System.out.println("i1 default Method");
    }
}
interface i2 extends ig
{
    // abstract show in i2
    void show(); // if no access modifier is specified then it will be an abstract method so it doesn't have any body
    
    default void defaultMethod()
    {
        System.out.println("i2 default Method");
    }

}

class intrface implements ig,i1,i2          // can implement all type of interface
{
    // The default method show() inherited from i1 conflicts with abstract method show() inherited from i2
    
    // So we have to override the show() method in order to overcome the conflict
    
    public void show()      // this access modifier has to b public as it is overriding the interface method because visibility cannot be reduced
    {
        System.out.println("\nShow in Class");
        i1.super.show(); // calling show method of interface 1 explicitly 
    }
    
    public void abstractMethod()     // must define a body as the abstract method is present in interface i1
    {
        // We have to implement all abstract methods of interfaces which is being implemented by overriding it in class
    }
    
    public void defaultMethod() // have to override the default method because both interface have same default method
    {
        System.out.println("\n defaultMethod in Class");
         // which will lead to ambiguous state of inheriting duplicate default methods from both interfaces
        i1.super.defaultMethod();
        i2.super.defaultMethod();
    }
    
    public void abstractPrint()
    {

    }

    public static void main(String[] args) {
        intrface i = new intrface();

        i.show();       // object class show method

        i.print();      // interface method because print is overridden

        i.defaultMethod();      // object class method
    }
}