package courseSalesSystem;

import courseSalesSystem.business.abstracts.CourseService;
import courseSalesSystem.business.concretes.CourseManager;
import courseSalesSystem.business.concretes.DiscountPriceCampaingManager;
import courseSalesSystem.dataAccess.concretes.NhCourseDal;
import courseSalesSystem.entities.Course;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java",65);
		Course course2 = new Course(2,"C#",85);
		Course course3 = new Course(3,"Python",40);
		
		CourseService courseService = new CourseManager(new NhCourseDal(), new DiscountPriceCampaingManager());
		courseService.add(course1);
		courseService.add(course2);
		courseService.add(course3);
		
		for (Course course : courseService.getAll()) {
			System.out.println(course.getName() + " : " + course.getPrice());
		}
	}

}
