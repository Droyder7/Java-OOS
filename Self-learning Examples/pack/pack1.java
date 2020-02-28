package pack;

public class pack1 {        // only one public class can possible in one source file 

    public void show()
    {
        System.out.println("pack1 show");
    }

    protected String s = "unPublic";        // String to be inherited in test
}

class hiddenCLass       // This is the hiddenCLass which can only be access by other classes in the same package
{
    public void show()
    {
        System.out.println("hiddenCLass show");
    }
}
        // inheriting under same package and same file is possible
class pac extends pack1
{

}