package com.dsu.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
    
    @RequestMapping("/login")
    public String sayHelloJsp(@RequestParam String name, ModelMap model){
        model.put("name", name);
        System.out.println("Request param is " + name); // not recommend for prod code
        return "login";
    }
}
