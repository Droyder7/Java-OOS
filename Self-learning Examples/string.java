class string
{
    public static void main(String[] args) {

        String s1 = "Info";

        String s2 = new String("Tech");
        
        s2 = s1 + " " + s2;

        int a = 2020;

        String s3 = s2 + a + "Batch";   // Converts a=2020 to String Literals like "Hello"

        System.out.println(s3);

        String s4 = "Hello";
        
        s4 += "World";      // concatenates it with previous string

        System.out.println(s4);

        // 2 ways to String objects

        String s5 = "JAVA";
        
        String s6 = new String("JAVA");
        
        if(s5==s6)      // Check if the two objects refers to the same object or not
            System.out.println("Same Object");
        else
            System.out.println("Not Same");     // not same as the refers to different objects

        String s7 = s6;

        if(s7==s6)      // Check if the two objects refers to the same object or not
            System.out.println("Same Object");
        else
            System.out.println("Not Same");     // same as the refers to different objects

        String s = "String";
        
        System.out.println(s.length()); // length() returns the no. of characters in string
        
        System.out.println(s.charAt(2)); // returns char at ith index
        
        System.out.println(s.substring(2)); // substring from ith index char to end
        
        System.out.println(s.substring(2, 5)); // substring from ith index char to i-1 index char

        System.out.println(s.equals("string")); // compares with passed object case-sensitive

        System.out.println(s.equalsIgnoreCase("string")); //compares non case-sensitive
        
        System.out.println(s.compareTo("string")); // compares lexicographically case-sensitive
        
        System.out.println(s.compareToIgnoreCase("string")); // compares lexicographically non case-sensitive
        
        System.out.println(s.concat("Added")); // returns concatenated string

        System.out.println(s.toLowerCase());

        System.out.println(s.toUpperCase());
        
        s = "TechKnowPathnow";
        
        System.out.println(s.indexOf("now")); // index of 1st occurrence of the specified String
        
        System.out.println(s.indexOf("now", 6)); // index of 1st occurrence of the specified String after specified index
        
        System.out.println(s.lastIndexOf("now")); // index of last occurrence of the specified String

        s = "  Tech Know Path  ";

        System.out.println(s.trim()); // trim spaces from both ends
        
        System.out.println(s.startsWith("  Tech"));

        System.out.println(s.endsWith("th  "));
        
    }
}