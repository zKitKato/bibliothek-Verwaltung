package net.kato.bibliothekVerwaltungBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kato.bibliothekVerwaltungBackend.dao.CategoryDAO;
import net.kato.bibliothekVerwaltungBackend.dto.CategoryDTO;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOimpl  implements CategoryDAO {

    private static List<CategoryDTO> categoriesDTO = new ArrayList<CategoryDTO>();

    /*
    * Testing Purpose data
    * */

    static{
        CategoryDTO categoryDTO  = new CategoryDTO();
        categoryDTO.setId(1);
        categoryDTO.setName("Scientific");
        categoryDTO.setDescription("Scientific Books for Physic's");
        categoriesDTO.add(categoryDTO);

        categoryDTO = new CategoryDTO();
        categoryDTO.setId(2);
        categoryDTO.setName("Romantic");
        categoryDTO.setDescription("Description for Romantic Books");
        categoriesDTO.add(categoryDTO);

        categoryDTO = new CategoryDTO();
        categoryDTO.setId(3);
        categoryDTO.setName("Horror");
        categoryDTO.setDescription("Description for Horror");
        categoriesDTO.add(categoryDTO);

        categoryDTO = new CategoryDTO();
        categoryDTO.setId(4);
        categoryDTO.setName("Novel");
        categoryDTO.setDescription("Description for novel");
        categoriesDTO.add(categoryDTO);

    }

    @Override
    public List<CategoryDTO> listofCategories() {
        System.out.println("Category List Size: " + categoriesDTO.size());
        return categoriesDTO;
    }

    @Override
    public CategoryDTO get(int id) {
        for(CategoryDTO category : categoriesDTO){
            if(category.getId() == id){
                return category;
            }

        }
        return null;
    }
}
