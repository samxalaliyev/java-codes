package business;
import core.logging.Logger;
import dataAcces.InstructorDao;
import entities.Instructors;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers=loggers;
    }

    public void add(Instructors instructor) throws Exception {
        if (instructor.getName().length()<3){
            throw new Exception("Instructer name should be bigger than 3 character");
        }

        instructorDao.add(instructor);
        for (Logger logger:loggers) {
            logger.log(instructor.getName()+" "+instructor.getSurName());
        }

    }
}
