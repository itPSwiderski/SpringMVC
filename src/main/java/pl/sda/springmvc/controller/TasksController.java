package pl.sda.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TasksController {

    @GetMapping("home")
    public String getHome(){
        return "tasks/home";
    }

    @GetMapping
    public String getTask(){
        return "tasks/get";
    }

    @PostMapping
    public String postTask(){
        return "tasks/post";
    }

    @PutMapping
    public String putTask(){
        return "tasks/put";
    }

    @PatchMapping
    public String patchTask(){
        return "tasks/patch";
    }

    @DeleteMapping
    public String deleteTask(){
        return "tasks/delete";
    }

}
