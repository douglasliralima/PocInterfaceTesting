package com.douglas.testesInterface.repositories;

import com.douglas.testesInterface.Modal.TodoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoDTO, Long> {

}
