
class Complex
{
    float real;
    float imaginary;

    public Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(float real) {
        this.real = real;
        this.imaginary = 0;
    }
    
    public Complex()
    {
        real = imaginary = 0;
    }

    public Complex add(Complex c) {
        Complex t=new Complex();
        t.real =real + c.real;
        t.imaginary =imaginary+ c.imaginary;
        return t;
    }

    public Complex multiply(Complex c) {
        Complex t=new Complex();
        t.real =real * c.real;
        t.imaginary =imaginary* c.imaginary;
        return t;
    }
    
    public void print() {
        
        System.out.println(real+ " + i"+imaginary);
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);
        
        Complex c3=c1.add(c2);
        
        System.out.print("Sum of The Complex Numbers : ");
        c3.print();

        c3 = c1.multiply(c2);
        System.out.print("Product of The Complex Numbers : ");
        c3.print();
    }
}