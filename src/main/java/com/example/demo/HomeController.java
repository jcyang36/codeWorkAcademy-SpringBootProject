package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/")
public String index(){
    return "index";
}
    @GetMapping("/add")
    public String newTodo(Model model){
    model.addAttribute(new Thing());
    return "todoform";
    }
    @PostMapping("/add")
    public @ResponseBody String processTodo(@ModelAttribute Thing thing){
    String val = thing.getThing() +"-" +thing.getDemander();
        return thing.getThing();
    }
}


