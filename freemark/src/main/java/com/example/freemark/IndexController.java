package com.example.freemark;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/aboutMe")
    public String index(Model model){
        User user=new User();
        user.setAge(21);
        user.setPassword("123");
        user.setSex(1);
        user.setUsername("Ken");
        model.addAttribute("user",user);
        return "index";
    }
}
