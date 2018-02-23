import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;

//    public Author getAuthor() {
//        return author;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
//

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    @ManyToMany(mappedBy = "book")
    private List<Author> author;
}
