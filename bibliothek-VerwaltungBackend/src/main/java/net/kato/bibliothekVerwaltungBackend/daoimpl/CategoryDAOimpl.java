package net.kato.bibliothekVerwaltungBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kato.bibliothekVerwaltungBackend.dao.CategoryDAO;
import net.kato.bibliothekVerwaltungBackend.dto.Category;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOimpl  implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Category> listofCategories() {
        String selectActiveCategory = "FROM Category c WHERE c.active= :active";

        Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
        query.setParameter("active",true);

        return query.getResultList();
    }

    /*
    Getting single category based on id
     */
    @Override
    public Category get(int id) {

        return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
    }


    @Override
    @Transactional
    public boolean addCategory(Category category) {
        try {
            //add the category to the database table
            sessionFactory.getCurrentSession().persist(category);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    /*
    Updating a single category
     */
    @Override
    public boolean updateCategory(Category category) {
        try {
            sessionFactory.getCurrentSession().update(category);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteCategory(Category category) {

        try {
            category.setActive(false);
            sessionFactory.getCurrentSession().update(category);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }




}
///*
// * Testing Purpose data
// * */
//     private static List<Category> categories = new ArrayList<Category>();
//static{
//    Category categoryDTO  = new Category();
//    categoryDTO.setId(1);
//    categoryDTO.setName("Scientific");
//    categoryDTO.setDescription("Scientific Books for Physic's");
//    categories.add(categoryDTO);
//
//    categoryDTO = new Category();
//    categoryDTO.setId(2);
//    categoryDTO.setName("Romantic");
//    categoryDTO.setDescription("Description for Romantic Books");
//    categories.add(categoryDTO);
//
//    categoryDTO = new Category();
//    categoryDTO.setId(3);
//    categoryDTO.setName("Horror");
//    categoryDTO.setDescription("Description for Horror");
//    categories.add(categoryDTO);
//
//    categoryDTO = new Category();
//    categoryDTO.setId(4);
//    categoryDTO.setName("Novel");
//    categoryDTO.setDescription("Description for novel");
//    categories.add(categoryDTO);
//
//}




//
// for(Category category : categories){
//        if(category.getId() == id){
//        return category;
//            }
//
//                    }