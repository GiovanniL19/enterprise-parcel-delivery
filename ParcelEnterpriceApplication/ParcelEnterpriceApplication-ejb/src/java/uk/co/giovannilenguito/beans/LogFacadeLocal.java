package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Log;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Local
public interface LogFacadeLocal {

    void create(Log log);

    void edit(Log log);

    void remove(Log log);

    Log find(Object id);

    List<Log> findAll();

    List<Log> findRange(int[] range);

    int count();
    
}
