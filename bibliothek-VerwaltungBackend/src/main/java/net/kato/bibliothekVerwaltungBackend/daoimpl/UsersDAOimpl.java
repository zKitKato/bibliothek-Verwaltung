package net.kato.bibliothekVerwaltungBackend.daoimpl;

import net.kato.bibliothekVerwaltungBackend.dao.UserDAO;
import net.kato.bibliothekVerwaltungBackend.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UsersDAOimpl implements UserDAO {
    private static List<UserDTO> users = new ArrayList<>();

    /*
    * Testing Purpose data
    * */

    static {
        UserDTO admin1 = new UserDTO();
        admin1.setUsername("admin");
        admin1.setPassword("admin");

        UserDTO user2 = new UserDTO();
        user2.setUsername("user");
        user2.setPassword("user");

    }

    @Override
    public List<UserDTO> listOfUsers() {
        return users;
    }
}
