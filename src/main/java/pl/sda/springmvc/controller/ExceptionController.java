package pl.sda.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public String getNullPointerException(RuntimeException e){
        e.printStackTrace();
        return "exception";
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String error() {
        return "exception";
    }
}
