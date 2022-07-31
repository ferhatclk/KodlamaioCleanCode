package courseSalesSystem.business.concretes;

import java.util.List;

import courseSalesSystem.business.abstracts.CampaingService;
import courseSalesSystem.business.abstracts.CourseService;
import courseSalesSystem.dataAccess.abstracts.CourseDal;
import courseSalesSystem.entities.Course;

public class CourseManager implements CourseService{
	private CourseDal courseDal;
	private CampaingService campaingService;
	
	public CourseManager(CourseDal courseDal, CampaingService campaingService) {
		this.courseDal = courseDal;
		this.campaingService = campaingService;
	}

	@Override
	public void add(Course course) {
		courseDal.add(course);
		
	}

	
	@Override
	public List<Course> getAll() {
		campaingService.updatePrice(courseDal.getAll());
		return courseDal.getAll();
	}


}
