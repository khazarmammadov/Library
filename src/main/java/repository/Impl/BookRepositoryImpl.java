package repository.Impl;

import entity.BookEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jpaFactory.JpaFactory;
import jpaFactory.jpaFactoryImpl.JpaFactoryImpl;
import repository.BookRepository;

import java.util.Date;

public class BookRepositoryImpl implements BookRepository {
    private JpaFactory jpaFactory = new JpaFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager();
    private EntityTransaction transaction = jpaFactory.getEntityTransaction();

    @Override
    public void save(BookEntity book) {

        transaction.begin();

        entityManager.persist(book);

        transaction.commit();

    }

    @Override
    public void delete(BookEntity book) {
        transaction.begin();

        entityManager.remove(book);

        transaction.commit();
    }

    @Override
    public BookEntity find(int id) {
        return entityManager.find(BookEntity.class, id);
    }

    @Override
    public BookEntity update(BookEntity book) {

        return entityManager.merge(book);
    }
}
