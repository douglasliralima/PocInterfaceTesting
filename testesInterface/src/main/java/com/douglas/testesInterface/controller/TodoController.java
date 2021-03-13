package com.douglas.testesInterface.controller;

import com.douglas.testesInterface.Modal.TodoDTO;
import com.douglas.testesInterface.repositories.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("todo")
@AllArgsConstructor
public class TodoController {

    private final TodoRepository todoRepository;

    @PostMapping(value="/newTodo")
    public ResponseEntity<String> newTodo(@RequestBody Map<String, String> body){
        String content = body.get("content");
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setContent(content);
        todoRepository.save(todoDTO);

        return new ResponseEntity<String>(content + " criado", HttpStatus.OK);
    }

    @GetMapping(value = "/getAll")
    public List<TodoDTO> getAllTodo(){
        return todoRepository.findAll();
    }

    @DeleteMapping(value = "deleteTodo/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        todoRepository.deleteById(id);
        return new ResponseEntity<String>(id + " removido", HttpStatus.OK);
    }
}
