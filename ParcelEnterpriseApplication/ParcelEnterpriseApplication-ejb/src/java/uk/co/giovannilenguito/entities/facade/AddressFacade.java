package uk.co.giovannilenguito.entities.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uk.co.giovannilenguito.entities.Address;

/**
 *
 * @author Giovanni
 */
@Stateless
public class AddressFacade extends AbstractFacade<Address> implements AddressFacadeLocal {

    @PersistenceContext(unitName = "ParcelEnterpriseApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressFacade() {
        super(Address.class);
    }
    
}
