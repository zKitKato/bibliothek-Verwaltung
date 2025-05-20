package net.kato.bibliothekVerwaltungFrontend.controller;

import net.kato.bibliothekVerwaltungBackend.dao.CategoryDAO;
import net.kato.bibliothekVerwaltungBackend.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Home");

        // passing the categories
        mv.addObject("categories", categoryDAO.listofCategories());

        mv.addObject("userClickHome", true);
       return mv;
    }
    @RequestMapping(value = {"/bibitem"})
    public ModelAndView bibitem(@RequestParam("id")int id) {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Item Details");
        mv.addObject("userClickShopItem", true);
        mv.addObject("itemid", id);
        return mv;
    }


    @RequestMapping(value = {"/about"})
    public ModelAndView about() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "About Us");
        mv.addObject("userClickAbout", true);
        return mv;
    }

    @RequestMapping(value = {"/contact"})
    public ModelAndView contact() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Contact");
        mv.addObject("userClickContact", true);
        return mv;
    }

    @RequestMapping(value = {"/profile"})
    public ModelAndView profile()  {
        ModelAndView mv = new ModelAndView("page"); // Make sure this is "profile" or the name of your JSP file
        mv.addObject("title", "Profile");
        mv.addObject("userClickProfile", true);
        return mv;
    }

/*
* Methods to load all books based on category
* */

    @RequestMapping(value = {"/show/all/books"})
    public ModelAndView showAllBooks() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "All Books");

        // passing the categories
        mv.addObject("categories", categoryDAO.listofCategories());

        mv.addObject("userClickAllBooks", true);
        return mv;
    }

    @RequestMapping(value = {"/show/category/{id}/books"})
    public ModelAndView showCategoryBooks(@PathVariable ("id") int id) {
        ModelAndView mv = new ModelAndView("page");

        //categoryDAO to fetch a single category
        CategoryDTO categoryDTO = null;
        categoryDTO = categoryDAO   .get(id);
        mv.addObject("title", categoryDTO.getName());

        // passing the categories
        mv.addObject("categories", categoryDAO.listofCategories());
        mv.addObject("categories", categoryDTO);
        mv.addObject("userClickCategoryBooks", true);
        return mv;
    }

}




/*@RequestMapping(value = "/test")
    public ModelAndView test(@RequestParam(value="title", required = false)String greeting) {
        if (greeting == null) {
            greeting = "Welt!";
        }
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", greeting);
        return mv;
    }*/

//    /*@RequestMapping(value = "/test/{greeting}")
//    public ModelAndView test(@PathVariable("greeting") String greeting) {
//        if (greeting == null) {
//            greeting = "Welt!";
//        }
//        ModelAndView mv = new ModelAndView("page");
//        mv.addObject("title", greeting);
//        return mv;
//    }*/