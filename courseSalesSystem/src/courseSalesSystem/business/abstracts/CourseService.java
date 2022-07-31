package courseSalesSystem.business.abstracts;

import java.util.List;

import courseSalesSystem.entities.Course;

public interface CourseService {
	public void add(Course course);
	
	public List<Course> getAll();
	
}
