package business;

import core.logging.Logger;
import dataAcces.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> allCategory=new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }


    public void add(Category category) throws Exception {
        if (isNameExit(category)){
            throw new Exception("This categoey name is aleady exit" +" "+ category.getName());
        }
        categoryDao.add(category);
        allCategory.add(category);
        for (Logger logger:loggers) {
            logger.log(category.getName());
        }

    }
    public boolean isNameExit(Category category){
        for (Category exitCategory:allCategory) {
            if (exitCategory.getName()==category.getName()){
                return true;
            }
        }
        return false;
    }

}
