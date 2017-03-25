package uk.co.giovannilenguito.dto;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LogDTO {
    private Integer logId;
    private String title;
    private String message;
    private int customerId;
    private int driverId;
    
    public LogDTO() {
    }

    public LogDTO(Integer logId, String title, String message, int customerId, int driverId) {
        this.logId = logId;
        this.title = title;
        this.message = message;
        this.customerId = customerId;
        this.driverId = driverId;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }
    
}
