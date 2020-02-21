class Employee{
    String name, address;
    int id, sal;
    public Employee(){
        name=null;
        address=null;
        id=sal=0;
    }
    public Employee(String n, String a, int i, int s){
        name=n;
        address=a;
        id=i;
        sal=s;
    }
}
class Dept{
    String name, loc;
    Employee emp[];
    public Dept()
    {
        name=null;
        loc=null;
        emp = new Employee[1];
        emp[0]=new Employee();
    }
    public Dept(String n, String l, Employee e[])
    {
        name=n;
        loc=l;
        emp = e;
    }
    
    public  void add(Employee x) 
    { 
        Employee ne[] = new Employee[emp.length + 1]; 
  
        for (int i = 0; i < emp.length; i++) 
            ne[i] = emp[i]; 
  
        ne[emp.length] = x; 
  
        emp= ne; 
    }
    
    public void remove(int index )
    {
        if (emp == null || index < 0 || index >= emp.length) { 
            return ;
        } 

        Employee[] nEmp = new Employee[emp.length - 1]; 

        for (int i = 0, k = 0; i < emp.length; i++) { 
            if (i == index)
            {
                continue;
            }

        nEmp[k++] = emp[i];

        }

        emp = nEmp;
    }
    public static void main (String[] args) {
        Employee[] em = new Employee[5];
        
        for(int i=0; i<5; i++)
        {
            String n= new String("Employee"+(i+1));
            String ad=new String("Address"+(i+1));
            
            em[i]=new Employee(n,ad,i+1,i+9999);
        }
        
        Dept d=new Dept("Information Technology", "SaltLake", em);
        
        System.out.println("Yearly Expenditure for the department is : ");
        
        int s=0;
        
        for(int i=0; i<5; i++)
        {
            s+=d.emp[i].sal;   
        }
        
        System.out.println(12*s);
    }
    
}
