package uk.co.giovannilenguito.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Entity
@Table(name = "PARCEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parcel.findAll", query = "SELECT p FROM Parcel p")
    , @NamedQuery(name = "Parcel.findByParcelId", query = "SELECT p FROM Parcel p WHERE p.parcelId = :parcelId")
    , @NamedQuery(name = "Parcel.findByServiceType", query = "SELECT p FROM Parcel p WHERE p.serviceType = :serviceType")
    , @NamedQuery(name = "Parcel.findByContents", query = "SELECT p FROM Parcel p WHERE p.contents = :contents")
    , @NamedQuery(name = "Parcel.findByDateBooked", query = "SELECT p FROM Parcel p WHERE p.dateBooked = :dateBooked")
    , @NamedQuery(name = "Parcel.findByDeliveryDate", query = "SELECT p FROM Parcel p WHERE p.deliveryDate = :deliveryDate")
    , @NamedQuery(name = "Parcel.findByCustomer", query = "SELECT p FROM Parcel p WHERE p.customerId = :customerId")
    , @NamedQuery(name = "Parcel.findByDriver", query = "SELECT p FROM Parcel p WHERE p.driverId = :driverId")})
public class Parcel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "PARCEL_ID")
    private Integer parcelId;
    @Size(max = 255)
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    @Size(max = 255)
    @Column(name = "CONTENTS")
    private String contents;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_BOOKED")
    @Size(max = 255)
    private String dateBooked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DELIVERY_DATE")
    @Size(max = 255)
    private String deliveryDate;
    @Basic(optional = false)
    @Column(name = "COLLECTION_LINE_ONE")
    @Size(max = 255)
    private String collectionLineOne;
    @Basic(optional = false)
    @Column(name = "COLLECTION_POSTCODE")
    @Size(max = 255)
    private String collectionPostcode;
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Address addressId;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Customer customerId;
    @JoinColumn(name = "DRIVER_ID", referencedColumnName = "DRIVER_ID")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Driver driverId;
    @JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Location locationId;

    public Parcel() {
    }

    public Parcel(Integer parcelId) {
        this.parcelId = parcelId;
    }

    public Parcel(Integer parcelId, String dateBooked, String deliveryDate) {
        this.parcelId = parcelId;
        this.dateBooked = dateBooked;
        this.deliveryDate = deliveryDate;
    }

    public Parcel(Integer parcelId, String serviceType, String contents, String dateBooked, String deliveryDate, Address addressId, Customer customerId, Driver driverId, Location locationId) {
        this.parcelId = parcelId;
        this.serviceType = serviceType;
        this.contents = contents;
        this.dateBooked = dateBooked;
        this.deliveryDate = deliveryDate;
        this.addressId = addressId;
        this.customerId = customerId;
        this.driverId = driverId;
        this.locationId = locationId;
    }
    

    public Integer getParcelId() {
        return parcelId;
    }

    public void setParcelId(Integer parcelId) {
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
    
    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Driver getDriverId() {
        return driverId;
    }

    public void setDriverId(Driver driverId) {
        this.driverId = driverId;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parcelId != null ? parcelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcel)) {
            return false;
        }
        Parcel other = (Parcel) object;
        if ((this.parcelId == null && other.parcelId != null) || (this.parcelId != null && !this.parcelId.equals(other.parcelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.co.giovannilenguito.entities.Parcel[ parcelId=" + parcelId + " ]";
    }
    
}
