package com.exemple.testjava11.repos;

import com.exemple.testjava11.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
