package courseSalesSystem.dataAccess.abstracts;

import java.util.List;

import courseSalesSystem.entities.Course;

public interface CourseDal {
	public void add(Course course);
	
	public List<Course> getAll();
}
