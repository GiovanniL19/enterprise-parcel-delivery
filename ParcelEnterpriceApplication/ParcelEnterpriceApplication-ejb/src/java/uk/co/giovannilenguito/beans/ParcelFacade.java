package uk.co.giovannilenguito.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
public class ParcelFacade extends AbstractFacade<Parcel> implements ParcelFacadeLocal {

    @PersistenceContext(unitName = "ParcelEnterpriceApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParcelFacade() {
        super(Parcel.class);
    }
    
}
