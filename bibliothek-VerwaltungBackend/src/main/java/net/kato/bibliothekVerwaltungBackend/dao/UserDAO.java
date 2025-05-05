package net.kato.bibliothekVerwaltungBackend.dao;

import net.kato.bibliothekVerwaltungBackend.dto.UserDTO;

import java.util.List;

public interface UserDAO {
    List<UserDTO> listOfUsers();

}
