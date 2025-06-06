package net.kato.bibliothekVerwaltungBackend.dao;

import java.util.List;
import net.kato.bibliothekVerwaltungBackend.dto.Category;

public interface CategoryDAO {


    List<Category> listofCategories();

    Category get(int id);
    boolean addCategory(Category category);
    boolean updateCategory(Category category);
    boolean deleteCategory(Category category);

}
