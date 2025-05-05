package net.kato.bibliothekVerwaltungBackend.daoimpl;

import net.kato.bibliothekVerwaltungBackend.dao.BookDAO;
import net.kato.bibliothekVerwaltungBackend.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BookDAOimpl implements BookDAO {

    private static List<BookDTO> books = new ArrayList<BookDTO>();
    /*
     * Testing Purpose data
     * */

    static {
        BookDTO book1 = new BookDTO();
        book1.setId(1);
        book1.setTitle("The Greate Gatsby");
        book1.setDescription("The Greate Gatsby");
        book1.setIsbn("978-0743273565");
        book1.getAuthorId(2);
        book1.setCategoryId(4);
        book1.setTotal_copies(2);
        book1.setAvaliable_copies(2);
    }

    @Override
    public List<BookDTO> listOfBooks() {
        return books;
    }
}
