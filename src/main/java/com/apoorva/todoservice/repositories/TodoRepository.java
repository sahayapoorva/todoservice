package com.apoorva.todoservice.repositories;

import com.apoorva.todoservice.models.Todo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
    Todo findBy_id(ObjectId id);
}
