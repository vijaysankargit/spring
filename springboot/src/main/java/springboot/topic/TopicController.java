package springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	//	@RequestMapping(method = RequestMethod.POST,value = "/inserttopic")
	//	public String insertTopic(@RequestParam String id, @RequestParam String name, @RequestParam String description) {
	//	Topic newTopic = new Topic();
	//	newTopic.setId(id);
	//	newTopic.setName(name);
	//	newTopic.setDescription(description);
	//	topicService.addTopic(newTopic);
	//	return "Topic Saved Successfully";
	//	}
	//	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
	public void updateTopic(@PathVariable String id , @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}

	@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
