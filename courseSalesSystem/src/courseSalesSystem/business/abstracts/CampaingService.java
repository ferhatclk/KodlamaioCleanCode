package courseSalesSystem.business.abstracts;

import java.util.List;

import courseSalesSystem.entities.Course;

public interface CampaingService {
	
	public void updatePrice(List<Course> courses);
}
