package courseSalesSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import courseSalesSystem.dataAccess.abstracts.CourseDal;
import courseSalesSystem.entities.Course;

public class NhCourseDal implements CourseDal{
	private List<Course> courses;
	
	public NhCourseDal() {

		courses = new ArrayList<>();
	}

	@Override
	public void add(Course course) {
		courses.add(course);
		
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

}
