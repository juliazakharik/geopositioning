package by.bsu.samples.microservice.controller;

import by.bsu.samples.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @Autowired
  private UserService service;

  @GetMapping(value = "/home")
  public String home(Model model) {
    model.addAttribute("users", service.list());
    return "index";
  }

}
