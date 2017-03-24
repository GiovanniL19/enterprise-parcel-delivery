package uk.co.giovannilenguito.dto;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class AddressDTO {
    private Integer addressId;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String postcode;
    private String country;

    public AddressDTO() {
    }

    public AddressDTO(Integer addressId, String lineOne, String lineTwo, String city, String postcode, String country) {
        this.addressId = addressId;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
