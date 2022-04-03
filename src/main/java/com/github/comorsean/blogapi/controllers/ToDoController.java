package com.github.comorsean.blogapi.controllers;

import com.github.comorsean.blogapi.payload.response.ToDoResponse;
import com.github.comorsean.blogapi.payload.response.ToDosResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @GetMapping("")
    public ToDosResponse getTodos() {
        return new ToDosResponse(List.of(new ToDoResponse("first todo"), new ToDoResponse("something")));
    }
}
