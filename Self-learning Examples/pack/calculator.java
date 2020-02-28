package pack;

import pack.product.multiply;

/**
 * calculator
 */
public class calculator {

    public int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        
        calculator ob = new calculator();

        System.out.println("Addition : " + ob.add(10, 5));
        
        multiply m = new multiply();
        System.out.println("Multiplication : "+m.product(10, 5));

    }
}