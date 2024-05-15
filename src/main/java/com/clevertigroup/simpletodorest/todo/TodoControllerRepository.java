package com.clevertigroup.simpletodorest.todo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "todos")
public interface TodoControllerRepository extends MongoRepository<Todo,String> {
}
