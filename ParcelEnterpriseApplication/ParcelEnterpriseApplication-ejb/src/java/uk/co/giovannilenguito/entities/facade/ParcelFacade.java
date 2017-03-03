package uk.co.giovannilenguito.entities.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni
 */
@Stateless
public class ParcelFacade extends AbstractFacade<Parcel> implements ParcelFacadeLocal {

    @PersistenceContext(unitName = "ParcelEnterpriseApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParcelFacade() {
        super(Parcel.class);
    }
    
}
