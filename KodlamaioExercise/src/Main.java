import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAcces.HibernateProductDao;
import dataAcces.JdbcProductDao;
import entities.Category;
import entities.Course;
import entities.Instructors;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Instructors instructor1=new Instructors("Engin","Demirog");
        Logger[] loggers= {new DatabaseLogger(),new MailLogger(),new FileLogger()};
        InstructorManager instructorManager=
                new InstructorManager(new JdbcProductDao(), loggers);

        instructorManager.add(instructor1);

        System.out.println("---------------------------Insturctor------------------------");

        Course course=new Course("Java Course.",235);
        Course course1=new Course("C# Course.",500);
        Logger[] loggers1={new DatabaseLogger(),new FileLogger()};
        CourseManager courseManager= new CourseManager(new JdbcProductDao(),loggers1);
        courseManager.add(course);
        System.out.println("---------NEW COURSE----------");
        courseManager.add(course1);

        System.out.println("-------------------------Categories---------------------------");

        Category category=new Category("Backend Programming");
        Category category2=new Category("Frontend Programming");
        Logger[] loggers2={new MailLogger()};
        CategoryManager categoryManager=new CategoryManager(new HibernateProductDao(),loggers2);
        categoryManager.add(category);
        categoryManager.add(category2);
    }
}