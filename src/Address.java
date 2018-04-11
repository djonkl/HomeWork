public class Address {

    private String street;
    private String zipcode;
    private String city;

    public String getStreet() {
        return street;
    }
    @Override
    public String toString() {
        return "Адрес: " +
                " Улица " + street + ',' +
                " Код: " + zipcode + ',' +
                " Город: " + city + '\n';
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
