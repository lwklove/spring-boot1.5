package cn.lwkang.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(ModelMap map){
        map.addAttribute("msg","http://lwkang.cn");
        return "hello";
    }

    @GetMapping("/index")
    public String index(ModelMap map){
        return "index";
    }

    @RequestMapping("home")
    public String home(ModelMap map){
        return "home";
    }
}
