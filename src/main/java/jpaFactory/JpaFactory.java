package jpaFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public interface jpaFactory {
    EntityManager getEntityManager();
    EntityTransaction getEntityTransaction();

}
