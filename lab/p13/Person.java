class Person
{
    int age, weight, height;
    String address;
    Date dob;

    // public Person( int age, String address, Date dob) {
    //     this.age=age;
    //     this.dob=dob;
    //     this.address=address;
    // }

    public void display() {

        System.out.println(age);
        
    }

    public static void main(String[] args) {

        Person p = new Person();

        Employee e = new Employee();

        student s = new student();

        s.calcGrade();

        Technician t = new Technician();

        Professor pr = new Professor();

        pr.addCourse("IT");
        pr.addAdvise("Be Honest");
        
    }
}

class Employee extends Person
{
    int sal;
    Date doj;
    String exp;
}

class student extends Person
{
    int roll, marks[]=new int[1];
    String[] los = new String[1];
    
    // student(int r, int[] m, String[] s)
    // {
    //     roll = r;
    //     marks = m;
    //     los = s;
    // }

    void calcGrade()
    {
        int i, sum = 0;
        for( i=0; i<marks.length; i++)
        {
            sum += marks[i];
        }
        if (sum >= 90)
        System.out.println("Grade : S ");
    else if (sum >= 80)
        System.out.println("Grade : A ");
     else if (sum >= 70)
        System.out.println("Grade : B ");
        else if (sum >= 60)
        System.out.println("Grade : C ");
        else if (sum >= 50)
        System.out.println("Grade : D ");
        else if (sum >= 40)
        System.out.println("Grade : E ");
    else
        System.out.println("Grade : X ");
    }
}

class Technician extends Employee
{

}

class Professor extends Employee
{
    String courses[] = new String[1], listOfAdvise[] = new String[1];

   public void addCourse(String c)
    {
        int i, n = courses.length;

        String np[] = new String[n + 1];

        for (i = 0; i < n; i++)
            np[i] = courses[i];

        np[n] = c;

        courses = np;

    }
    
    void addAdvise(String a)
    {
        int i, n = listOfAdvise.length;

        String na[] = new String[n + 1];

        for (i = 0; i < n; i++)
            na[i] = listOfAdvise[i];

        na[n] = a;

        listOfAdvise = na;
    }
    
    void removeCourse(String s)
    {
        int i, k, n = courses.length;

        String np[] = new String[n - 1];

        for (i = 0, k = 0; i < n; i++) {
            if (courses[i].equals(s)) {
                continue;
            }
            np[k++] = courses[i];
        }

        courses = np;

    }
    
    void removeAdvise(String a)
    {
        int i, k, n = listOfAdvise.length;

        String np[] = new String[n - 1];

        for (i = 0, k = 0; i < n; i++) {
            if (listOfAdvise[i].equals(a)) {
                continue;
            }
            np[k++] = listOfAdvise[i];
        }

        listOfAdvise = np;
    }
}