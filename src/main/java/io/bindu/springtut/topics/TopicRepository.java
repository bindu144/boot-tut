package io.bindu.springtut.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	//getAllTopics
	//getTopic(String id)
	//updateTopic(Topic topic)
	//deleteTopic(String id)
}