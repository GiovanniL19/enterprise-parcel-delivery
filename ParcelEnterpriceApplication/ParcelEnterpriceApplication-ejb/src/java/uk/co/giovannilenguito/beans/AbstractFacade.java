package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Customer;
import uk.co.giovannilenguito.entities.Driver;
import uk.co.giovannilenguito.entities.Location;
import uk.co.giovannilenguito.entities.Log;
import uk.co.giovannilenguito.entities.Parcel;
/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public int createLocation(Location entity) {
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity.getLocationId();
    }
    
    public int createAddress(Address entity) {
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity.getAddressId();
    }
    
    public int createCustomer(Customer entity){
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity.getCustomerId();
    }
    
    public int createDriver(Driver entity){
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity.getDriverId();
    }
    
    public int createLog(Log entity){
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity.getLogId();
    }
    
    public int createParcel(Parcel entity){
        getEntityManager().persist(entity);
        getEntityManager().flush();
        return entity.getParcelId();
    }
    
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }
    
    public T findByUsername(Object username){
        String entityName = entityClass.getName().replace(".", " ");
        entityName = entityName.substring(entityName.lastIndexOf(" ") + 1);
        
        Query query = getEntityManager().createNamedQuery(entityName + ".findByUsername");
        query.setParameter("username", username);
        return (T) query.getSingleResult();
    }
    
    public List<T> findByCustomer(Object customer)    {
        String entityName = entityClass.getName().replace(".", " ");
        entityName = entityName.substring(entityName.lastIndexOf(" ") + 1);
        
        Query query = getEntityManager().createNamedQuery(entityName + ".findByCustomer");
        query.setParameter("customerId", customer);
        
        return query.getResultList();
    }
    
    public List<T> findByDriver(Object driver)    {
        String entityName = entityClass.getName().replace(".", " ");
        entityName = entityName.substring(entityName.lastIndexOf(" ") + 1);
        
        Query query = getEntityManager().createNamedQuery(entityName + ".findByDriver");
        query.setParameter("driverId", driver);
        
        return query.getResultList();
    }
    
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
