package test;

import entity.BookEntity;
import repository.BookRepository;
import repository.Impl.BookRepositoryImpl;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        BookEntity sherlockHolmes = new BookEntity(2134, "Sherlock Holmes", 601,
                "Detective", "Arthur Conan Doyle", new Date());

        BookRepository book1 = new BookRepositoryImpl();
        System.out.println(book1.find(2134).toString());
    }
}
