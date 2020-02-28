package p1;

/**
 * derv2
 */
public class derv2 extends p2.derv1 {

    public void priv() {
        System.out.println("derv2 : Private");
    }

    public void def()
    {
        System.out.println("derv2 : default");
    }

    public void pro() {
        System.out.println("derv2 : protected");
    }

    public void pub()
    {
        System.out.println("derv2 : Public");
    }
}