package pl.sda.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String getHome() {
        String[] array = new String[2];
        System.out.println(array[3]);
        return "home";
    }


    @GetMapping("/**")
    public String get404() {
        return "error404";
    }


    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String error() {
        return "error404";
    }
}
