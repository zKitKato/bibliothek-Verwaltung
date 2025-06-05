package net.kato.bibliothekVerwaltungBackend.dao;


import net.kato.bibliothekVerwaltungBackend.dto.Books;

import java.util.List;

public interface BookDAO {
    List<Books> listOfBooks();
}
