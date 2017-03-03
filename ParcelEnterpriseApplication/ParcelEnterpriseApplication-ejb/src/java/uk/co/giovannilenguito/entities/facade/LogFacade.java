package uk.co.giovannilenguito.entities.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uk.co.giovannilenguito.entities.Log;

/**
 *
 * @author Giovanni
 */
@Stateless
public class LogFacade extends AbstractFacade<Log> implements LogFacadeLocal {

    @PersistenceContext(unitName = "ParcelEnterpriseApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogFacade() {
        super(Log.class);
    }
    
}
