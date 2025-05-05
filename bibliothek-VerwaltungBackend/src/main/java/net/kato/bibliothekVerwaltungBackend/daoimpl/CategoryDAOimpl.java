package net.kato.bibliothekVerwaltungBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kato.bibliothekVerwaltungBackend.dao.CategoryDAO;
import net.kato.bibliothekVerwaltungBackend.dto.CategoryDTO;

public class CategoryDAOimpl  implements CategoryDAO {

    private static List<CategoryDTO> categories = new ArrayList<CategoryDTO>();

    /*
    * Testing Purpose data
    * */

    static{
        CategoryDTO c1 = new CategoryDTO();
        c1.setId(1);
        c1.setName("Scientific");
        c1.setDescription("Scientific Books for Physic's");

        CategoryDTO c2 = new CategoryDTO();
        c2.setId(2);
        c2.setName("Romantic");
        c2.setDescription("Description for Romantic Books");

        CategoryDTO c3 = new CategoryDTO();
        c3.setId(3);
        c3.setName("Horror");
        c3.setDescription("Description for Horror");

        CategoryDTO c4 = new CategoryDTO();
        c4.setId(4);
        c4.setName("novel");
        c4.setDescription("Description for novel");


    }

    @Override
    public List<CategoryDTO> listofCategories() {
        return categories;
    }
}
