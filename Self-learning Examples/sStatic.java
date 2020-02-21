class sStatic {
    int d1,count;
    static int d2, staticData=1;
    static String str = "JU";

    static {
        d2 = 10;        // initializing static staticData in static block
        System.out.println("static block 1");       // 1st static block invoked
    }

    {
        System.out.println("initialization block");     // this initialization block will be invoked whenever a new object is created
    }

    sStatic() {
        count = staticData++;
        System.out.println("Constructor");      // invoked whenever object without parameter is created
    }

    static {
        System.out.println("static block 2");       // 2nd static block invoked
    }

    sStatic(int d) {
        d1 = d;
        System.out.println("Parameterized Constructor");        // invoked whenever object with parameter is created
    }

    int mul() {
        return d1 * d2;
    }

    public static void add(String s) {      // Invoke only when one string is passed
        str = s;
        // static method cant access any non static member directly or without object
    }

    public static void add(String s1, String s2) {      // Invoke only when two string is passed
        str = s1 + s2;
    }

    public static void main(String[] args) {

        //2 static blocks already invoked before executing main

        System.out.println("in Main");

        System.out.println("static staticData : " +sStatic.d2);       // Accessing static staticData member directly through class

        sStatic s = new sStatic(); // initialization block invoked
        
        // count = 1 ;  staticData = 2;

        sStatic s2 = new sStatic(10);   // initialization block invoked again while creating another object


        System.out.println(s.d1 + "*" + sStatic.d2 + "=" + s.mul());
        
        s.d1 = 4;
        
        System.out.println(s.mul());

        // Static Members

        sStatic.d2 = 5;     // changing static staticData directly by class

        System.out.println("static staticData : " +sStatic.d2); 

        System.out.println(s.mul());

        System.out.println(sStatic.str);

        // Static Member Method

        sStatic.add("IT");     // Calling static method directly by Class

        System.out.println(sStatic.str);       // printing it after changing

        sStatic s1 = new sStatic();     // count = 2 ;  staticData = 3;
        
        System.out.println(s1.str); // Accessing static staticData by the object which could be done bt with a warning

        // Overloading of Static Member Method

        sStatic.add("JU", "IT"); // Calling Overloaded static method directly by Class
        
        System.out.println(sStatic.str);

        System.out.println();
        
        // Count

        System.out.println(s.count);    

        System.out.println(s1.count);

        System.out.println(sStatic.staticData); // staticData = 3

        System.out.println(s2.staticData);

        sStatic s3 = new sStatic();     // count = 3 ;  staticData = 4;
        System.out.println(s3.staticData);
        System.out.println(s3.count);
    }
} 