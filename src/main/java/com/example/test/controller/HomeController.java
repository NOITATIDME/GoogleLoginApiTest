package com.example.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// homecontroller : 첫 홈 화면 
@Controller
public class HomeController {
	   @GetMapping(value = {"/","/home"})
	   public String home() {
	      System.out.println("...");
	      
	      
	      return "index";
	   }
}
