package factory;
import uk.co.giovannilenguito.dto.AddressDTO;
import uk.co.giovannilenguito.dto.CustomerDTO;
import uk.co.giovannilenguito.dto.DriverDTO;
import uk.co.giovannilenguito.dto.LocationDTO;
import uk.co.giovannilenguito.dto.LogDTO;
import uk.co.giovannilenguito.dto.ParcelDTO;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Customer;
import uk.co.giovannilenguito.entities.Driver;
import uk.co.giovannilenguito.entities.Location;
import uk.co.giovannilenguito.entities.Log;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParserFactory {
    private static ParserFactory instance = null;
    
    private ParserFactory(){}
    
    public static ParserFactory getInstance(){
        if(instance == null){
            instance = new ParserFactory();
        }
        
        return instance;
    }
    
    public Address AddressToEntity(AddressDTO dtoObj){
     return new Address(dtoObj.getAddressId(), dtoObj.getLineOne(), dtoObj.getLineTwo(), dtoObj.getCity(), dtoObj.getPostcode(), dtoObj.getCountry());
    }
    
    public Customer CustomerToEntity(CustomerDTO dtoObj, Address address){
     return new Customer(dtoObj.getCustomerId(), dtoObj.getEmail(), dtoObj.getContactNumber(), dtoObj.getUsername(), dtoObj.getPassword(), dtoObj.getFullName(), address);
    }
    
    public Driver DriverToEntity(DriverDTO dtoObj){
        return new Driver(dtoObj.getDriverId(), dtoObj.getEmail(), dtoObj.getContactNumber(), dtoObj.getUsername(), dtoObj.getPassword(), dtoObj.getFullName());
    }
    
    public Location LocationToEntity(LocationDTO dtoObj){
        return new Location(dtoObj.getLocationId(), dtoObj.getLongitude(), dtoObj.getLatitude(), dtoObj.getStatus(), dtoObj.getIsDelivered(), dtoObj.getIsOutForDelivery(), dtoObj.getIsCollecting(), dtoObj.getIsProcessing(), dtoObj.getDateTime());
    }
    
    public Parcel ParcelToEntity(ParcelDTO dtoObj, Address address, Customer customer, Driver driver, Location location){
        return new Parcel(dtoObj.getParcelId(), dtoObj.getServiceType(), dtoObj.getContents(), dtoObj.getDateBooked(), dtoObj.getDeliveryDate(), address, customer, driver, location);
    }
    
    public Log LogToEntity(LogDTO dtoObj, Customer customer, Driver driver){
        return new Log(dtoObj.getLogId(), dtoObj.getTitle(), dtoObj.getMessage(), customer, driver);
    }
    
}
