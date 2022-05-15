package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerFactory {
    private static EntityManagerFactory entityManagerFactory;
    
    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("ProjetoJavaSwingPU");
        }
        
        return entityManagerFactory.createEntityManager();
    }
}
