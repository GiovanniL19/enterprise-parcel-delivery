package uk.co.giovannilenguito.dto;

import java.io.Serializable;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelDTO implements Serializable{
    private int parcelId;
    private String serviceType;
    private String contents;
    private String dateBooked;
    private String deliveryDate;
    private String collectionLineOne;
    private String collectionPostcode;
    private int addressId;
    private int customerId;
    private int driverId;
    private int locationId;

    public ParcelDTO() {
    }

    public ParcelDTO(int parcelId, String serviceType, String contents, String dateBooked, String deliveryDate, String collectionLineOne, String collectionPostcode, int addressId, int customerId, int driverId, int locationId) {
        this.parcelId = parcelId;
        this.serviceType = serviceType;
        this.contents = contents;
        this.dateBooked = dateBooked;
        this.deliveryDate = deliveryDate;
        this.collectionLineOne = collectionLineOne;
        this.collectionPostcode = collectionPostcode;
        this.addressId = addressId;
        this.customerId = customerId;
        this.driverId = driverId;
        this.locationId = locationId;
    }

    public int getParcelId() {
        return parcelId;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(String dateBooked) {
        this.dateBooked = dateBooked;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getCollectionLineOne() {
        return collectionLineOne;
    }

    public void setCollectionLineOne(String collectionLineOne) {
        this.collectionLineOne = collectionLineOne;
    }

    public String getCollectionPostcode() {
        return collectionPostcode;
    }

    public void setCollectionPostcode(String collectionPostcode) {
        this.collectionPostcode = collectionPostcode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
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

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
    
    
}
