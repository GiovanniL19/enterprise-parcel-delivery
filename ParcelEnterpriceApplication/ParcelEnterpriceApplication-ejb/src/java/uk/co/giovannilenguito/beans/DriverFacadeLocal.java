package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Driver;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Local
public interface DriverFacadeLocal {

    int createDriver(Driver driver);

    void edit(Driver driver);

    void remove(Driver driver);

    Driver find(Object id);
    
    Driver findByUsername(Object username);

    List<Driver> findAll();

    List<Driver> findRange(int[] range);

    int count();
    
}
