import jdk.Exported;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;

@Entity(name = "author")
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = ("First_Name"))
    private String firstName;
    @Column(name = ("Last_Name"))
    @Transient
    private String lastName;
    @Column(name = ("Age"))
    private int age;

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


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
