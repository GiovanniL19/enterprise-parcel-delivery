package uk.co.giovannilenguito.dto;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LocationDTO {
    private Integer locationId;
    private double longitude;
    private double latitude;
    private String status;
    private Boolean isDelivered;
    private Boolean isOutForDelivery;
    private Boolean isCollecting;
    private Boolean isProcessing;
    private String dateTime;

    public LocationDTO() {
    }

    public LocationDTO(Integer locationId, double longitude, double latitude, String status, Boolean isDelivered, Boolean isOutForDelivery, Boolean isCollecting, Boolean isProcessing, String dateTime) {
        this.locationId = locationId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.status = status;
        this.isDelivered = isDelivered;
        this.isOutForDelivery = isOutForDelivery;
        this.isCollecting = isCollecting;
        this.isProcessing = isProcessing;
        this.dateTime = dateTime;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(Boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public Boolean getIsOutForDelivery() {
        return isOutForDelivery;
    }

    public void setIsOutForDelivery(Boolean isOutForDelivery) {
        this.isOutForDelivery = isOutForDelivery;
    }

    public Boolean getIsCollecting() {
        return isCollecting;
    }

    public void setIsCollecting(Boolean isCollecting) {
        this.isCollecting = isCollecting;
    }

    public Boolean getIsProcessing() {
        return isProcessing;
    }

    public void setIsProcessing(Boolean isProcessing) {
        this.isProcessing = isProcessing;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
