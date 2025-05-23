package com.example.demo.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.customexception.UserException;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(UserException.class)
	public ModelAndView handleUserException(UserException ex) {
        ModelAndView mav = new ModelAndView("login"); // return to login.html
        mav.addObject("loginError", ex.getMessage()); // send error message
        return mav;
    }
}

