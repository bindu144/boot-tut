package io.bindu.springtut.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	/**
	 * Format for name of the function for Spring data JPA to recognise and
	 * implement the function automatically
	 */
	public List<Course> findByName(String name);

	public List<Course> findByDescription(String desc);
	
	public List<Course> findByTopicId(String topicId);
	// getAllTopics
	// getTopic(String id)
	// updateTopic(Topic topic)
	// deleteTopic(String id)
}
