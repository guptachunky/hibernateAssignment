import jdk.Exported;
import org.hibernate.annotations.CollectionType;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "author")
public class Author {

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", book=" + book +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", Books=" + Books +
                ", address=" + address +
                ", dob=" + dob +
                '}';
    }

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @OneToOne
    private Book book;

    @Column(name = ("First_Name"))
    private String firstName;
    @Column(name = ("Last_Name"))
    @Transient
    private String lastName;

    @Column(name = ("Age"))
    private int age;

    public List<String> getBooks() {
        return Books;
    }

    public void setBooks(List<String> books) {
        Books = books;
    }

    @ElementCollection
    List<String> Books;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;


    @Temporal(TemporalType.DATE)
    @Column(name = ("Date_Of_Birth"))
    private Date dob;

    public Date getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
