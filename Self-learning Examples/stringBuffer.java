class stringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(); // capacity 16 char

        System.out.println(sb.length()+" "+sb.capacity());
                
        sb = new StringBuffer(10); // capacity 18 char
        
        System.out.println(sb.length() + " " + sb.capacity());
        
        sb = new StringBuffer("java"); // length of "java" = 4 + 16 = 20 char capacity
        
        System.out.println(sb.length()+" "+sb.capacity());
        
        System.out.println(sb.charAt(2)); // ith index char
        
        sb.reverse();       // Reverse the original string also returns it

        System.out.println(sb);

        sb = new StringBuffer("Info");

        sb.append("Tech"); // add text/number at the end of original string
        
        System.out.println(sb);

        sb.insert(4, 41.253f);    // insert specified string after the ith character

        System.out.println(sb);

        sb.replace(4, 10, "2");      // replace start to end - 1 index char

        System.out.println(sb);

        sb.setCharAt(4, 'o');       // replaces the char at ith index with specified char

        System.out.println(sb);

        sb.deleteCharAt(4);     // totally delete char at ith index

        System.out.println(sb);

        sb.delete(0, 4);        // deletes char from start to end - 1

        System.out.println(sb+" "+sb.capacity());

        sb.ensureCapacity(40);      // if 40 > cap then cap = cap*2 + 2 else cap = 40

        System.out.println(sb.capacity());
    }
}