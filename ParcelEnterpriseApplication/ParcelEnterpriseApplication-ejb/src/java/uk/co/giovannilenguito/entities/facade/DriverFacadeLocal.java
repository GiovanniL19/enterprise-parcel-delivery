package uk.co.giovannilenguito.entities.facade;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Driver;

/**
 *
 * @author Giovanni
 */
@Local
public interface DriverFacadeLocal {

    void create(Driver driver);

    void edit(Driver driver);

    void remove(Driver driver);

    Driver find(Object id);

    List<Driver> findAll();

    List<Driver> findRange(int[] range);

    int count();
    
}
