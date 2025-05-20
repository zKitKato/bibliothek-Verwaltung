package net.kato.bibliothekVerwaltungBackend.dao;

import java.util.List;
import net.kato.bibliothekVerwaltungBackend.dto.CategoryDTO;

public interface CategoryDAO {
    List<CategoryDTO> listofCategories();

    CategoryDTO get(int id);
}
