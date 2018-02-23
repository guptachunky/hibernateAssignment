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

        List<String> book=new ArrayList<>();
        book.add("book 1");
        book.add("book 2");
        book.add("book 3");
        author1.setBooks(book);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(author1);
//        session.save(address);
        session.getTransaction().commit();

    }
}
