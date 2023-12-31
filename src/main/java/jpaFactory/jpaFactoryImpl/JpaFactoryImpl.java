package jpaFactory.jpaFactoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpaFactory.JpaFactory;

public class JpaFactoryImpl implements JpaFactory {
    private EntityManager entityManager = null;

    @Override
    public EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Library");
        this.entityManager = factory.createEntityManager();

        return entityManager;
    }

    @Override
    public EntityTransaction getEntityTransaction() {

        return this.entityManager.getTransaction();
    }
}
