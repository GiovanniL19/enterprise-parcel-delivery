package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Customer;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Local
public interface CustomerFacadeLocal {

    void create(Customer customer);

    void edit(Customer customer);

    void remove(Customer customer);

    Customer find(Object id);
    
    Customer findByUsername(Object username);

    List<Customer> findAll();

    List<Customer> findRange(int[] range);

    int count();
    
}
