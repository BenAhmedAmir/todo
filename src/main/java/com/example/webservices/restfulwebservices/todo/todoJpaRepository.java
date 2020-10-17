package com.example.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface todoJpaRepository extends JpaRepository<Todo, Long> {
	List <Todo>findByusername(String username);
}
