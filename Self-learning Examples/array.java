class array {
    public static void main(String[] args) {
        
        int a[] = new int[5];

        a[0] = 1;

        System.out.println(a.length);

        int b[] = { 1, 2, 3, 4 }; //  Way of initializing array while declaring
        System.out.println(b.length);

        int ar[][] = new int[2][];

        ar[0] = new int[4];
        ar[1] = new int[3];

        for (int r = 0; r < ar.length; r++)
        {
            for (int c = 0; c < ar[r].length; c++) {
                ar[r][c] = 1;
                System.out.print(ar[r][c]);

            }
            System.out.println();
        }

        // String Array

        String s[][] = new String[2][];
        s[0] = new String[3];
        s[1] = new String[2];

        s[0][0] = "Java ";

        System.out.println(s[0][0]+s.length+s[0].length);
    }
}