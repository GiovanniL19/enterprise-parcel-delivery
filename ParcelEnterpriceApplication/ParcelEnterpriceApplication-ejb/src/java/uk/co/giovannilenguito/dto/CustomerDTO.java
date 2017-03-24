package uk.co.giovannilenguito.dto;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class CustomerDTO {
    private Integer customerId;
    private String email;
    private String contactNumber;
    private String username;
    private String password;
    private String fullName;
    private int addressId;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer customerId, String email, String contactNumber, String username, String password, String fullName, int addressId) {
        this.customerId = customerId;
        this.email = email;
        this.contactNumber = contactNumber;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.addressId = addressId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    
    
}
