import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Author author=new Author();
        author.setFirstName("Chunks");
        author.setLastName("Gupta");
        author.setAge(22);
        author.setDob(new Date());

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(author);
        session.getTransaction().commit();

    }
}
