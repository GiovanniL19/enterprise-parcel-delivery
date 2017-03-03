package uk.co.giovannilenguito.entities.facade;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Location;

/**
 *
 * @author Giovanni
 */
@Local
public interface LocationFacadeLocal {

    void create(Location location);

    void edit(Location location);

    void remove(Location location);

    Location find(Object id);

    List<Location> findAll();

    List<Location> findRange(int[] range);

    int count();
    
}
