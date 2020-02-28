package p1;

/**
 * base
 */
public class base {

    private void priv() {
        System.out.println("Base : Private");
    }

    void def()
    {
        System.out.println("Base : default");
    }

    protected void pro() {
        System.out.println("Base : protected");
    }

    public void pub()
    {
        System.out.println("Base : Public");
    }

    public final void show()
    {
        System.out.println("Show");
        priv();
        def();
        pro();
        pub();
    }
}