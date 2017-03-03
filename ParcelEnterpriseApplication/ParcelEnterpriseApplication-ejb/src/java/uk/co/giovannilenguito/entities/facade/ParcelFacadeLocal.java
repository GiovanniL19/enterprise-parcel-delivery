package uk.co.giovannilenguito.entities.facade;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni
 */
@Local
public interface ParcelFacadeLocal {

    void create(Parcel parcel);

    void edit(Parcel parcel);

    void remove(Parcel parcel);

    Parcel find(Object id);

    List<Parcel> findAll();

    List<Parcel> findRange(int[] range);

    int count();
    
}
