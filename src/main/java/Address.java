public class Address {

private int streetNumber;
private String location;

    public int getStreetNumber() {
        return streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
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
