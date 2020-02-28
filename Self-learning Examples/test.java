import pack.*;

// import pk2.*;
// import pack.product.multiply;    // as it is commented fully qualified name had to use
import static java.lang.Math.*;
import static java.lang.System.*;       // no need to use fully qualified name like System.out

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        pack1 p1 = new pack1();
        p1.show();
        

        pack2 p2 = new pack2();
        p2.show();

        calculator ob = new calculator();

        System.out.println("Addition : " + ob.add(10, 5));

        pack.product.multiply m = new pack.product.multiply();      // fully qualified name is used here 
        System.out.println("Multiplication : " + m.product(10, 5));
        
        double d = sqrt(2.0);   // because math imported static

        out.println(d); // because system static imported
        
        pack.same s = new pack.same();
                                            // Resolving name conflicts by  using fully qualified name
        pk2.same sm = new pk2.same();   

        p1 = new derived();
        p1.show();

        pk2.subPack sp = new pk2.subPack();     // no need to import package when fully  qualified path is used

    }
}
    // inheriting pack1 class of package pack
class derived extends pack1
{
   public void show()
   {
       System.out.println("String : "+s);
   }
}