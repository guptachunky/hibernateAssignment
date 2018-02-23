import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Address address=new Address();
        address.setLocation("g-37 Gulshan park");
        address.setState("Delhi");
        address.setStreetNumber(41);

        Author author1 = new Author();
        author1.setFirstName("Chunks");
        author1.setLastName("Gupta");
        author1.setAge(22);
        author1.setDob(new Date());
        author1.setAddress(address);

        List<String> bookList=new ArrayList<>();
        bookList.add("book 1");
        bookList.add("book 2");
        bookList.add("book 3");
        author1.setBooks(bookList);
        Book book=new Book();
        book.setBookName("book1");
        Book book1=new Book();
        book1.setBookName("book1");
        List<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book);
        author1.setBook(books);
        List<Author> author=new ArrayList<>();
        author.add(author1);
        book.setAuthor(author);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(author1);
        session.save(book);
        session.save(book1);
        session.getTransaction().commit();

    }
}
