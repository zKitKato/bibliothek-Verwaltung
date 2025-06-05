package net.kato.bibliothekVerwaltungBackend.daoimpl;

import net.kato.bibliothekVerwaltungBackend.dao.UserDAO;
import net.kato.bibliothekVerwaltungBackend.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAOimpl implements UserDAO {
    private static List<User> users = new ArrayList<>();

    /*
    * Testing Purpose data
    * */

    static {
        User admin1 = new User();
        admin1.setUsername("admin");
        admin1.setPassword("admin");

        User user2 = new User();
        user2.setUsername("user");
        user2.setPassword("user");

    }

    @Override
    public List<User> listOfUsers() {
        return users;
    }
}
