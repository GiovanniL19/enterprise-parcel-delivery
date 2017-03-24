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
@Table(name = "LOCATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
    , @NamedQuery(name = "Location.findByLocationId", query = "SELECT l FROM Location l WHERE l.locationId = :locationId")
    , @NamedQuery(name = "Location.findByLongitude", query = "SELECT l FROM Location l WHERE l.longitude = :longitude")
    , @NamedQuery(name = "Location.findByLatitude", query = "SELECT l FROM Location l WHERE l.latitude = :latitude")
    , @NamedQuery(name = "Location.findByStatus", query = "SELECT l FROM Location l WHERE l.status = :status")
    , @NamedQuery(name = "Location.findByIsDelivered", query = "SELECT l FROM Location l WHERE l.isDelivered = :isDelivered")
    , @NamedQuery(name = "Location.findByIsOutForDelivery", query = "SELECT l FROM Location l WHERE l.isOutForDelivery = :isOutForDelivery")
    , @NamedQuery(name = "Location.findByIsCollecting", query = "SELECT l FROM Location l WHERE l.isCollecting = :isCollecting")
    , @NamedQuery(name = "Location.findByIsProcessing", query = "SELECT l FROM Location l WHERE l.isProcessing = :isProcessing")
    , @NamedQuery(name = "Location.findByDateTime", query = "SELECT l FROM Location l WHERE l.dateTime = :dateTime")})
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "LOCATION_ID")
    private Integer locationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LONGITUDE")
    private double longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LATITUDE")
    private double latitude;
    @Size(max = 255)
    @Column(name = "STATUS")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_DELIVERED")
    private Boolean isDelivered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_OUT_FOR_DELIVERY")
    private Boolean isOutForDelivery;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_COLLECTING")
    private Boolean isCollecting;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_PROCESSING")
    private Boolean isProcessing;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_TIME")
    private String dateTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "locationId")
    private Collection<Parcel> parcelCollection;

    public Location() {
    }

    public Location(Integer locationId) {
        this.locationId = locationId;
    }

    public Location(Integer locationId, double longitude, double latitude, String status, Boolean isDelivered, Boolean isOutForDelivery, Boolean isCollecting, Boolean isProcessing, String dateTime) {
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

    @XmlTransient
    public Collection<Parcel> getParcelCollection() {
        return parcelCollection;
    }

    public void setParcelCollection(Collection<Parcel> parcelCollection) {
        this.parcelCollection = parcelCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationId != null ? locationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.co.giovannilenguito.entities.Location[ locationId=" + locationId + " ]";
    }
    
}
