package lab.p16;

class book {
  String publisher, title, author;
  double cost;
  int stock;

  book() {
    title = "noTitle";
    publisher = "noPublisher";
    author = "noAuthor";
    cost = 0;
    stock = 0;
  }

  book(String t, String ps, String a, double c, int s) {
    publisher = ps;
    title = t;
    author = a;
    cost = c;
    stock = s;
  }

  void Details() {
    System.out.println("Book Details:- ");
    System.out.println("title - " + title);
    System.out.println("authors - " + author);
    System.out.println("publisher - " + publisher);
  }
}

public class bookshop {
  book b[] = new book[1];

  public bookshop() {
    b[0] = new book();
  }

  void add(String t, String ps, String a, double c, int s) {
    book bk = new book(t, ps, a, c, s);

    int i, n = b.length;

    book np[] = new book[n + 1];

    for (i = 0; i < n; i++)
      np[i] = b[i];

    np[n] = bk;

    b = np;
  }

  public void buy(String t, String a, int c) {
    for (int j = 0; j < b.length; j++) {
      if (t.equalsIgnoreCase(b[j].title) && a.equalsIgnoreCase(b[j].author)) {
        b[j].Details();
        if (b[j].stock < c) {
          System.out.println("required copies not in stock");
          return;
        }
        System.out.println("Total Cost:- " + b[j].cost * c);
        return;
      }
    }
    System.out.println("book not found");
    {
    }
  }

  public static void main(String[] args) {

    bookshop bs = new bookshop();

    bs.buy("t", "a", 3);
  }
}