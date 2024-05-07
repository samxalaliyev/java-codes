package business;


import core.logging.Logger;
import dataAcces.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> allCourses = new ArrayList<>();

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (course.getPrice() < 0) {
            throw new Exception("The price of the course cannot be 0");
        }
        if (isCourseExist(course)) {
            throw new Exception("This name is already exist");
        }
        courseDao.add(course);
        allCourses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());
        }


    }
    public boolean isCourseExist(Course course){
        for (Course existCourses:allCourses){
            if (existCourses.getName()==course.getName()){
                return true;
            }
        }
        return false;
    }
}
