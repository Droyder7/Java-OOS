interface Shape
{
    double area();            

    void rotate();

    void move(double a, double b);

    void draw();

}
 class Circle implements Shape
{
    double x,y,r;
    
     public double area()
    {
        return 3.14*r*r;
    }
    public void move(double a, double b)
    {
        x+=a;
        y+=b;
    }
  public  void rotate()
{

}
  public  void draw()
{

}
    void print()
    {
        System.out.println("Centre : ("+x+","+y+")");
        System.out.println("Radius : "+r+"\n");
    }
    public static void main (String[] args) {
    
    Circle c1 = new Circle();
    c1.print();
    
    Circle c2 = new Circle();
    c2.print();
    
    Rectangle r1 = new Rectangle();
    r1.print();
    
    Rectangle r2 = new Rectangle();
    r2.print();
    
    Rectangle r3 = new Rectangle();
    r3.print();
    
    r1.move(2,3);
    c1.move(4,5);
    
    c1.print();
    r1.print();
        
    }
}
class Rectangle implements Shape
{
    double x,y,l,w;
    
    public double area()
    {
        return l*w;
    }
    
    public void move(double a, double b)
    {
        x+=a;
        y+=b;
    }
  public  void rotate()
{

}
    public  void draw()
{

}
    
    void print()
    {
        System.out.println("Centre : ("+x+","+y+")");
        System.out.println("Length : "+l);
        System.out.println("Width : "+w+"\n");
    }
}