package net.kato.bibliothekVerwaltungBackend.dao;


import net.kato.bibliothekVerwaltungBackend.dto.Book;

import java.util.List;

public interface BookDAO {
    List<Book> listOfBooks();
    Book get(int id);

    boolean updateBook(Book book);
}
