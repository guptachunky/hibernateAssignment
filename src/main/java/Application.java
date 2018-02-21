import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

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

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(author1);
        session.getTransaction().commit();

    }
}
