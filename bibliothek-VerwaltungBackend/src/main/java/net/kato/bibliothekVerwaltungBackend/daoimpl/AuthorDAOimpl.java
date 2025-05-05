package net.kato.bibliothekVerwaltungBackend.daoimpl;

import net.kato.bibliothekVerwaltungBackend.dao.AuthorDAO;
import net.kato.bibliothekVerwaltungBackend.dto.AuthorDTO;

import java.util.ArrayList;
import java.util.List;

public class AuthorDAOimpl implements AuthorDAO {

    private static List<AuthorDTO> authors = new ArrayList<>();

    /*
     * Testing Purpose data
     * */

    static {
        AuthorDTO a1 = new AuthorDTO();
        a1.setId(1);
        a1.setFirstName("Anton");
        a1.setLastName("Zeillinger");

        AuthorDTO a2 = new AuthorDTO();
        a2.setId(2);
        a2.setFirstName("Francis");
        a2.setLastName("Scott Key Fitzgerald");

    }


    @Override
    public List<AuthorDTO> listofAuthors() {
        return authors;
    }
}
