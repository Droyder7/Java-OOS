package p2;

/**
 * derv1
 */
public class derv1 extends p1.base
{
    public void priv() {
        System.out.println("derv1 : Private");
    }

    public void def()
    {
        System.out.println("derv1 : default");
    }

    public void pro() {
        System.out.println("derv1 : protected");
    }

    public void pub()
    {
        System.out.println("derv1 : Public");
    }
}