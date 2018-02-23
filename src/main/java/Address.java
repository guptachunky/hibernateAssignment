import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AddressId;
    private int streetNumber;

    public int getAddressId() {
        return AddressId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressId=" + AddressId +
                ", streetNumber=" + streetNumber +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    private String location;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;


}
