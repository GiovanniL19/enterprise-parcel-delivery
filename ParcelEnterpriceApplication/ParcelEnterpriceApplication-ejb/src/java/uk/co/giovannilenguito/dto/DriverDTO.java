package uk.co.giovannilenguito.dto;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class DriverDTO {
    private Integer driverId;
    private String email;
    private String contactNumber;
    private String username;
    private String password;
    private String fullName;

    public DriverDTO() {
    }

    public DriverDTO(Integer driverId, String email, String contactNumber, String username, String password, String fullName) {
        this.driverId = driverId;
        this.email = email;
        this.contactNumber = contactNumber;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
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
    
    
}
