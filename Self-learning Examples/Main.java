class Main {
    public static void main(String[] args) {

        System.out.println("String[] main");

        Main.main("Hello");

    }

    public static void main(String arg1) {
            
            System.out.println("One arg main"+arg1);

        Main.main("Hi", "Hello");
    
        }
        
    
    public static void main(String a1, String a2) {

        System.out.println("Two argument main : " + a1 + a2);

        Main.main(3);
    }
    
    
    
    public static void main(int i) {

        System.out.println("One integer main: "+i);
        
    }

}