package jpaFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public interface JpaFactory {
    EntityManager getEntityManager();
    EntityTransaction getEntityTransaction();

}
