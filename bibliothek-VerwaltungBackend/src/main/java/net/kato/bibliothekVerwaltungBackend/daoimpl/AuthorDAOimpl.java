package net.kato.bibliothekVerwaltungBackend.daoimpl;

import net.kato.bibliothekVerwaltungBackend.dao.AuthorDAO;
import net.kato.bibliothekVerwaltungBackend.dto.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDAOimpl implements AuthorDAO {

    private static List<Author> authors = new ArrayList<>();

    /*
     * Testing Purpose data
     * */

    static {
        Author a1 = new Author();
        a1.setId(1);
        a1.setFirstName("Anton");
        a1.setLastName("Zeillinger");

        Author a2 = new Author();
        a2.setId(2);
        a2.setFirstName("Francis");
        a2.setLastName("Scott Key Fitzgerald");

    }


    @Override
    public List<Author> listofAuthors() {
        return authors;
    }
}
