package javafinalassignment2;

public class Address {
    //Declarations
    public String streetInfo1;
    public String streetInfo2;
    public String city;
    public String postalCode;
    public String province;
    public String country;

    public Address(String st1, String st2, String city, String postCode, String prov, String country){
        streetInfo1 = st1;
        streetInfo2 = st2;
        this.city = city;
        postalCode = postCode;
        province = prov;
        this.country = country;
    }

    @Override
    public String toString() {
        return  "\nStreet Info 1: " + streetInfo1 +
                "\nStreet Info 2: " + streetInfo2 +
                "\nCity: " + city  +
                "\nPostal Code: " + postalCode  +
                "\nProvince: " + province  +
                "\nCountry: " + country;
    }
}
