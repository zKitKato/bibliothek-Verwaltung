package net.kato.bibliothekVerwaltungBackend.dao;


import net.kato.bibliothekVerwaltungBackend.dto.BookDTO;

import java.util.List;

public interface BookDAO {
    List<BookDTO> listOfBooks();
}
