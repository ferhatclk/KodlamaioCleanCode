package courseSalesSystem.business.concretes;

import java.util.List;

import courseSalesSystem.business.abstracts.CampaingService;
import courseSalesSystem.entities.Course;

public class DiscountPriceCampaingManager implements CampaingService{

	@Override
	public void updatePrice(List<Course> courses) {
		for (Course course : courses) {
			course.setPrice((course.getPrice()*getPercentageDiscount()));
		}
		
	}
	
	private double getPercentageDiscount() {
		return 0.9;
	}

}
