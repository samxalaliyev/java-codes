package dataAcces;

import entities.Category;
import entities.Course;
import entities.Instructors;

public class HibernateProductDao implements InstructorDao, CourseDao,CategoryDao{
    public void add(Instructors instructor){
        System.out.println("Added to database with Hibernate: " + instructor.getName()+" "+instructor.getSurName());
    }

    @Override
    public void add(Category category) {
        System.out.println("Added to database with Hibernate: " + category.getName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with Hibernate: " + course.getName() +" "+course.getPrice());
    }
}
