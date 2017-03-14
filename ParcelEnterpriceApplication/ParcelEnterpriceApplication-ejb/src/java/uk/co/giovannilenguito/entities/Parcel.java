package uk.co.giovannilenguito.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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
    , @NamedQuery(name = "Parcel.findByDeliveryDate", query = "SELECT p FROM Parcel p WHERE p.deliveryDate = :deliveryDate")})
public class Parcel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private int dateBooked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DELIVERY_DATE")
    private int deliveryDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parcelId")
    private Collection<Location> locationCollection;
    @JoinColumn(name = "COLLECTION_ADDRESS", referencedColumnName = "ADDRESS_ID")
    @ManyToOne(optional = false)
    private Address collectionAddress;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false)
    private Customer customerId;
    @JoinColumn(name = "DRIVER_ID", referencedColumnName = "DRIVER_ID")
    @ManyToOne(optional = false)
    private Driver driverId;
    @JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID")
    @ManyToOne(optional = false)
    private Location locationId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parcelId")
    private Collection<Address> addressCollection;

    public Parcel() {
    }

    public Parcel(Integer parcelId) {
        this.parcelId = parcelId;
    }

    public Parcel(Integer parcelId, int dateBooked, int deliveryDate) {
        this.parcelId = parcelId;
        this.dateBooked = dateBooked;
        this.deliveryDate = deliveryDate;
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

    public int getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(int dateBooked) {
        this.dateBooked = dateBooked;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @XmlTransient
    public Collection<Location> getLocationCollection() {
        return locationCollection;
    }

    public void setLocationCollection(Collection<Location> locationCollection) {
        this.locationCollection = locationCollection;
    }

    public Address getCollectionAddress() {
        return collectionAddress;
    }

    public void setCollectionAddress(Address collectionAddress) {
        this.collectionAddress = collectionAddress;
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

    @XmlTransient
    public Collection<Address> getAddressCollection() {
        return addressCollection;
    }

    public void setAddressCollection(Collection<Address> addressCollection) {
        this.addressCollection = addressCollection;
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
        return "uk.co.giovannilenguito.Parcel[ parcelId=" + parcelId + " ]";
    }
    
}
