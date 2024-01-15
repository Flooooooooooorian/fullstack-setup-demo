package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepo;

    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }
}
