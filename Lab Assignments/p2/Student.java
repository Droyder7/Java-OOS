class Student {
    int[] marks = new int[3];
    String name;

    public Student(final String n, final int a, final int b, final int c) {
        name = n;
        marks[0] = a;
        marks[1] = b;
        marks[2] = c;
    }

    public void setdata() {
        name = "null";
        marks[0] = 0;
        marks[1] = 0;
        marks[2] = 0;
    }

    public int avg() {
        int s = 0;
        for (int i = 0; i < 3; i++) {
            s += marks[i];
        }
        return s / 3;
    }

    public void display() {
        System.out.println("Student's Name : " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Mark " +( i + 1) + " : " + marks[i]);
        }
    }

    public static void main(String[] args) {

        Student st = new Student("Sam", 66, 77, 88);

        st.display();

        System.out.println("Average marks : " + st.avg());

    }
}