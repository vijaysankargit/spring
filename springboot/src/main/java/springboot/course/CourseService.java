package springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	//	List<Course> topics = new ArrayList<>(Arrays.asList(
	//			new Course("spring", "Spring Boot", "Spring Boot Application"),
	//			new Course("java", "JAVA", "Java Application"),
	//			new Course("spring", "Spring MVC", "Spring MVC Application")));

	public List<Course> getAllCourses(String topicId){
		//		return topics;
		List<Course> topicList = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(topicList::add);
		return topicList;
	}

	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		//		topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course updatedTopic) {
		//		for(int i = 0;i<topics.size();i++) {
		//			Topic t = topics.get(i);
		//			if(t.getId().equals(id)) {
		//				topics.set(i, updatedTopic);
		//				return;
		//			}
		//		}
		courseRepository.save(updatedTopic);
	}

	public void deleteCourse(String id) {
		//		topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}
}
