package courseSalesSystem.business.concretes;

import java.util.List;

import courseSalesSystem.business.abstracts.CampaingService;
import courseSalesSystem.entities.Course;

public class FixedPriceCampaingManager implements CampaingService{

	@Override
	public void updatePrice(List<Course> courses) {
		for (Course course : courses) {
			course.setPrice(getFixedPrice());
		}
		
	}
	
	private double getFixedPrice() {
		return 49.99;
	}

}
