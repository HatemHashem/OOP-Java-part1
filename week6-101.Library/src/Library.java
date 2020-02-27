import java.util.ArrayList;

public class Library {
    private ArrayList<Book>booksInLibrary;

    public Library() {
        booksInLibrary=new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        booksInLibrary.add(newBook);
    }
    public void printBooks(){
        for(Book book:booksInLibrary){
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> booksWithTheSameTitle=new ArrayList<Book>();
      for(Book book:booksInLibrary){
          if(StringUtils.included(book.title(),title)){
              booksWithTheSameTitle.add(book);
          }
      }
        return booksWithTheSameTitle;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> booksWithTheSamePublisher=new ArrayList<Book>();
        for(int i=0;i<booksInLibrary.size();i++){
            if(StringUtils.included(booksInLibrary.get(i).publisher(),publisher)){
                booksWithTheSamePublisher.add(booksInLibrary.get(i));
            }
        }

        return booksWithTheSamePublisher;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> booksWithTheSameYear=new ArrayList<Book>();
        for(Book book:booksInLibrary){
            if(book.year()==year){
                booksWithTheSameYear.add(book);
            }

        }
            return booksWithTheSameYear;
    }
}
