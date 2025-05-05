package net.kato.bibliothekVerwaltungBackend.dao;

import net.kato.bibliothekVerwaltungBackend.dto.AuthorDTO;

import java.util.List;

public interface AuthorDAO {
    List<AuthorDTO> listofAuthors();
}
