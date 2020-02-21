
class Box
{   
    int height, width, breadth;

    public Box(int x, int y, int z) {
        height = x;
        width = y;
        breadth = z;
    }
   
    public Box()
    {
        height = width = breadth = 0;
    }

    public void display() {

        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth" + breadth);
    }
    
    public int getArea()
    {
        return width * breadth;
    }

    public int getVolume()
    {
        return height * width * breadth;
    }

    public static void main(String args[]) {
        
        Box b1 = new Box(5, 2, 3);
        Box b2 = new Box(3, 4, 5);

        
        System.out.println("Volume of Box 1 : " + b1.getVolume());
        System.out.println("Volume of Box 2 : " + b2.getVolume());
        
        System.out.println("Area of Box 1 :"+ b1.getArea());
        System.out.println("Area of Box 2 :"+ b2.getArea());
    }
}