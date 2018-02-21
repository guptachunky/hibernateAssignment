import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstName("Chunks");
        author1.setLastName("Gupta");
        author1.setAge(22);
        author1.setDob(new Date());

        Author author2 = new Author();
        author2.setFirstName("Neelam");
        author2.setLastName("Gupta");
        author2.setAge(24);
        author2.setDob(new Date());

        Author author3 = new Author();
        author3.setFirstName("Prachi");
        author3.setLastName("julka");
        author3.setAge(24);
        author3.setDob(new Date());

        Author author4 = new Author();
        author4.setFirstName("Chunky");
        author4.setLastName("Gupta");
        author4.setAge(22);
        author4.setDob(new Date());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.save(author4);
        session.getTransaction().commit();

    }
}
