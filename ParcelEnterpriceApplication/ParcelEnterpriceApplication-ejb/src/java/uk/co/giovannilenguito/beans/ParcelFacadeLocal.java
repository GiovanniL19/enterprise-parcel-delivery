package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Local
public interface ParcelFacadeLocal {

    void create(Parcel parcel);

    void edit(Parcel parcel);

    void remove(Parcel parcel);

    Parcel find(Object id);
    
    Parcel findByCustomer(int id);
    
    Parcel findByDriver(int id);

    List<Parcel> findAll();

    List<Parcel> findRange(int[] range);

    int count();
    
}
