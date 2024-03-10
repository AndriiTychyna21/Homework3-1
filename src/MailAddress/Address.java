package MailAddress;

public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private int apartment;

    public Address(){
        this.index = null;
        this.country = null;
        this.city = null;
        this.street = null;
        this.house = null;
        this.apartment = 0;
    }

    public Address(String index, String country, String city, String street, String house, int apartment){
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;      //if apartment = 0, then the recipient does not live in the apartment
    }

    public int getApartment() {
        return apartment;
    }

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHouse() {
        return house;
    }

    public String getStreet() {
        return street;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString(){
        String address = house + " " + street;
        if (apartment != 0) address = address + ", apt " + apartment + "\n";
        else address = address + "\n";
        address = address + "%s, %s\n%s\n".formatted(city, index, country);
        return address;
    }
}
