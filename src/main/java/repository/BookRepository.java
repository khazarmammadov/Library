package repository;

import entity.BookEntity;

public interface BookRepository {
    void save(BookEntity book);
    void delete(BookEntity book);
    BookEntity find(int id);
    BookEntity update(BookEntity book);
}
