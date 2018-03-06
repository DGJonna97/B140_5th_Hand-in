import java.util.ArrayList;

public class Library  {
    StockKeeper sk;
    private static ArrayList<Customer> costumers = new ArrayList<Customer>();
    private static ArrayList<Librarian> librarians = new ArrayList<Librarian>();

    Library(){}

    public boolean rent(Book book){
      return false;
    }

    public boolean returnBook(Book book) {
      return false;
    }

    public void addBook(Book book) {}

    public void removeBook(Book book) {}
	
}
