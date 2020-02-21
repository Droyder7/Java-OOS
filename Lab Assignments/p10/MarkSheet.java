class Student
{
   static int count=0;
   String Name,sub[];
   int roll;
   Student()
   {
      Name="noName";
      sub=new String[5];
      for (int i = 0; i < 5; i++)
         sub[i] = "noSubject";
      roll=++count;
   }
   Student(String n,String s[])
   {
      Name = n;
      sub = new String[s.length];
      for (int i = 0; i < s.length; i++)
         sub[i] = s[i];
      roll = ++count;
   }

   void printStudent()
   {
      System.out.println("Student subName : " + Name);
      System.out.println("Roll No : " + roll);
      for(int i=0; i<5; i++)
      {
         System.out.println("Subject " + (i + 1) + " : "+sub[i]);
      }
   }
}
class TabulationSheet
{
   int roll[];
   String subName;
   float marks[];

   TabulationSheet()
   {
      subName="noSubject";
      roll=new int[1];
      marks=new float[1];
      //marks[0]=0.0f;
   }
   TabulationSheet(String n,int r[],float m[])
   {
      subName = n;
      roll = r;
      marks = m;
   }
   
   void addTab(int r, float m)
   {
      int ne[] = new int[roll.length + 1]; 
  
        for (int i = 0; i < roll.length; i++) 
            ne[i] = roll[i]; 
  
        ne[roll.length] = r; 
  
      roll = ne;
        
      float nm[] = new float[marks.length + 1]; 
  
        for (int i = 0; i < marks.length; i++) 
            nm[i] = roll[i]; 
  
        nm[marks.length] = m; 
  
      marks = nm;
   }
}
class MarkSheet
{
   Student stu;
   float marks[] = new float[5];
   MarkSheet()
   {
      stu=new Student();
   }
   MarkSheet(Student s,float m[])
   {
      stu = s;
      marks = m;
      //       for(int i=0;i<s.sub.length;i++)
      //       {
      //          for(int j=0;j<tab.length;j++)
      //          {
      //         if(s.sub[i].equalsIgnoreCase(tab[j].subName))
      //         {
      //             for(int k=0;k<tab[j].stu.length;k++)
      //           {
      //           if(stu.roll==tab[j].stu[k].roll)
      //             {
      //              marks[i]=tab[j].marks[k];
      //               break;
      //           }
      //           }
      //           break;
      //         }
      //       }
      //       }
   }

   void print()
   {
      stu.printStudent();
      for(int i=0; i<marks.length; i++)
      {
         System.out.println("Mark "+(i+1)+" : " + marks[i]);
      }
      System.out.println();
   }
      
   void addMark(String name, float m[])
   {
      stu.Name = name;
      marks = m;
   }

      public static void main(String args[])
   {
      Student stu[] = new Student[3];

      for(int i=0; i<3; i++)
      {
         stu[i] = new Student();
      }
      
      TabulationSheet ts[] = new TabulationSheet[5];

      for(int i=0; i<5; i++)
      {
         ts[i] = new TabulationSheet();
      }

      MarkSheet ms[] = new MarkSheet[3];

      for(int i=0; i<3; i++)
      {
         ms[i] = new MarkSheet();
         ms[i].print();
      }

   }
}