package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.AddressFacadeREST.class);
        resources.add(service.CustomerFacadeREST.class);
        resources.add(service.DriverFacadeREST.class);
        resources.add(service.LocationFacadeREST.class);
        resources.add(service.LogFacadeREST.class);
        resources.add(service.ParcelFacadeREST.class);
    }
    
}
