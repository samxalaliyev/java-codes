package dataAcces;

import entities.Category;
import entities.Course;
import entities.Instructors;

public class JdbcProductDao implements InstructorDao,CourseDao,CategoryDao {
    public void add(Instructors instructor){
        System.out.println("Added to database with JDBC: " + instructor.getName()+" "+instructor.getSurName());
    }

    @Override
    public void add(Category category) {
        System.out.println("Added to database with JDBC: " + category.getName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with JDBC: " + course.getName() +" Price: "+ course.getPrice() +"$");
    }
}
