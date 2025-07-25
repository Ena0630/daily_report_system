package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import constants.JpaConst;

public class DBUtil {
    
    private static EntityManagerFactory emf;
    
    // EntityManagerインスタンスを生成
    public static EntityManager createEntityManager() {
        return _getEntityManagerFactory().createEntityManager();
    }
    
    // EntityManagerFactoryインスタンスを生成
    private static EntityManagerFactory _getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(JpaConst.PERSISTENCE_UNIT_NAME);
        }
        
        return emf;
    }

}
