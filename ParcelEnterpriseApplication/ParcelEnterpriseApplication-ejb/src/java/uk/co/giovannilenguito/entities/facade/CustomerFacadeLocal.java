package uk.co.giovannilenguito.entities.facade;

import java.util.List;
import javax.ejb.Local;
import uk.co.giovannilenguito.entities.Customer;

/**
 *
 * @author Giovanni
 */
@Local
public interface CustomerFacadeLocal {

    void create(Customer customer);

    void edit(Customer customer);

    void remove(Customer customer);

    Customer find(Object id);

    List<Customer> findAll();

    List<Customer> findRange(int[] range);

    int count();
    
}
