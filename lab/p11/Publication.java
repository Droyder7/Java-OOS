/**
 * Publication
 */
public abstract class Publication {

    String publisherName;
	float price;
    int noOfPages;

    void print()
    {
        System.out.println("Publication Name : " + publisherName);
        System.out.println("Price : " + price);
        System.out.println("No of Pages : " + noOfPages);
    }
    
    public static void main(String[] args) {
        
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        Journal j1 = new Journal();
        Journal j2 = new Journal();

        Library l = new Library(b1);

        //l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(j1);
        l.add(j2);

        l.printDetails();
    }
    

}

class Book extends Publication
{
   Book()
    {
        publisherName = "noPublisher";
        price = 0;
        noOfPages = 0;
    }
   
    Book(String pb, float p, int n )
    {
        publisherName = pb;
        price = p;
        noOfPages = n;
    }

    
}

class Journal extends Publication
{
    Journal()
    {
        publisherName = "noPublisher";
        price = 0;
        noOfPages = 0;
    }
   
    Journal(String pb, float p, int n )
    {
        publisherName = pb;
        price = p;
        noOfPages = n;
    }
}

class Library
{
    Publication p[] = new Publication[1];

    Library(Publication x)
    {
        p[0] = x;
    }
     
    void add(Publication x) 
    {
        int i, n = p.length;

        Publication np[] = new Publication[n + 1];

        for (i = 0; i < n; i++)
            np[i] = p[i];

        np[n] = x;

        p = np;
    }
    
    void printDetails()
    {
        for(int i=0; i<p.length; i++)
        {
            p[i].print();   
        }
    }
}