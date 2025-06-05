/*
package net.kato.bibliothekVerwaltungBackend.test;

import net.kato.bibliothekVerwaltungBackend.dao.CategoryDAO;
import net.kato.bibliothekVerwaltungBackend.dto.Category;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

    private static AnnotationConfigApplicationContext context;

    private static CategoryDAO categoryDAO;

    private static Category category;

    @BeforeClass
    public static void init(){
        context = new AnnotationConfigApplicationContext();
        context.scan("net.kato.bibliothekVerwaltungBackend");
        context.refresh();

        categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
    }


    */
/*@Test
    public void testAddCategory(){
        category = new Category();
        category.setName("Horror");
        category.setDescription("Some test description for the category Horror");
        assertEquals("Successfully added a category inside the table!",true,categoryDAO.addCategory(category));
        Category category2 = new Category();
        category2.setName("TV");
        category2.setDescription("Some test description for the category TV");

    }

    @Test
    public void testGetCategory(){
        category = categoryDAO.get(1);

        assertEquals("Successfully fetched a single category from the table!","Horror",category.getName());
    }

    @Test
    public void testUpdateCategory(){
        category = categoryDAO.get(1);

        category.setDescription("New description");
        assertEquals("Successfully updated a single category in the table!",true,categoryDAO.updateCategory(category));

    }

    @Test
    public void testDeleteCategory(){
        assertEquals("Successfully deleted a single category in the table!",false,categoryDAO.deleteCategory(category));

    }

    @Test
    public void testListCategories(){

        assertEquals("Successfully fetched the list of categories from the table!",1,categoryDAO.listofCategories().size());
    }*//*




    @Test
    public void testCRUDCategory(){
        //add Operation
        category = new Category();
        category.setName("Novel");
        category.setDescription("Some test description for the category Novel");
        assertEquals("Successfully added a category inside the table!",true,categoryDAO.addCategory(category));

        category = new Category();
        category.setName("Roman");
        category.setDescription("Some test description for the category Roman");
        assertEquals("Successfully added a category inside the table!",true,categoryDAO.addCategory(category));

        //fetching and updating
        category = categoryDAO.get(1);
        category.setDescription("test description for Roman");
        assertEquals("Successfully updated a single category in the table!",true,categoryDAO.updateCategory(category));

        //delete the category
        assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.deleteCategory(category));

        //fetching the list
    }
}
*/
